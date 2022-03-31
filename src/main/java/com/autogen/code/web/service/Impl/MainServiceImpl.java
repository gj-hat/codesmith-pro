package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.utils.*;
import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.domain.vo.ManageLibraryUnionQueryVO;
import com.autogen.code.web.service.MainService;
import org.apache.struts.util.ResponseUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/7 18:46
 * @description：请求并下载springBoot官网的数据
 * @modified By：
 * @version: 1.0
 */
@Service
public class MainServiceImpl implements MainService {

    @Override
    public Boolean downZip(RequestParameterDto requestParameterDto) {

        String rootUrl = "https://start.springboot.io/starter.zip?";
        String url = rootUrl + requestParameterDto.springBootRequestToString();
        url = url.replace(",mybatis-plus","");
        // TODO: 2022/3/31    有点问题
        ResponseEntity<byte[]> entity = RestTemplateUtils.get(url, byte[].class);
//        ResponseEntity<byte[]> entity = RestTemplateUtils.get("https://start.springboot.io/starter.zip?type=maven-project&language=java&bootVersion=2.6.5&baseDir=demo&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&packaging=jar&javaVersion=11", byte[].class);
        byte[] body = entity.getBody();
        String zipPath = Constants.DOWN_PATH + requestParameterDto.getArtifactId() + ".zip";
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(zipPath);
            assert body != null;
            outputStream.write(body);
            outputStream.close();
            return true;
        } catch (IOException e) {
            return false;
        }


    }

    /**
     * 解压 注入相关基础文件夹
     *
     * @param artifactId  项目BaseDir
     * @param packageName 包名  小数点
     */
    @Override
    public boolean handleZip(String artifactId, String packageName) {

        // 删除之前的文件夹
        FileUtils.delAllFile(Constants.DECOMPRESSION);


        String sourcePath = Constants.DOWN_PATH + artifactId + ".zip";
        String targetPath = Constants.DECOMPRESSION;
        FileUtils.decompressionToZip(sourcePath, targetPath);
        FileUtils.injectionFolder(artifactId, packageName);

        // 删除自带的application.properties
        FileUtils.deleteFile(Constants.DECOMPRESSION + artifactId + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "application.properties");
        return true;
    }

    /**
     * 调用Velocity给模板中写入文件
     *
     * @param requestParameterDto    请求参数实体
     * @param manageLibraryUnionQueryVOS 多表查询结果
     */
    @Override
    public Boolean analysisAndWrite(RequestParameterDto requestParameterDto, List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryVOS) throws SQLException, ClassNotFoundException {


        Map<String, Map<String, List<String>>> stringMap = AnalysisSQL.analysisSqlStruct(requestParameterDto.getUrl(), requestParameterDto.getDriver(), requestParameterDto.getUsername(), requestParameterDto.getPassword());
        Map<String, Map<String, List<String>>> map = new HashMap<>();
        // map 是符合java风格的sql结构
        if (requestParameterDto.getDependencies().contains("postgresql")) {
            map = DataHandle.sqlStructToJavaStruct(stringMap, "postgresql");
        } else if (requestParameterDto.getDependencies().contains("mysql")) {
            map = DataHandle.sqlStructToJavaStruct(stringMap, "mysql");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("DataHandle", DataHandle.class);
        data.put("package", requestParameterDto.getPackageName());
        for (ManageLibraryUnionQueryVO mdu : manageLibraryUnionQueryVOS) {
            if (mdu.getLibraryName().equals("mybatis-mapper.xml")) {
                for (Map.Entry<String, Map<String, List<String>>> entry : stringMap.entrySet()) {
                    data.put("TableName", DataHandle.underlineToBigHump(entry.getKey()));
                    data.put("underLineTableAttribute", entry.getValue());
                    data.put("underLineTableName", entry.getKey());
                    for (Map.Entry<String, List<String>> entry1 : entry.getValue().entrySet()) {
                        if (entry1.getValue().get(2).equals("isPriKey")) {
                            data.put("underLinePriKey", entry1.getKey());
                            break;
                        }
                    }
                    GenUtils.generatorCode(data, mdu.getLibraryContent(), requestParameterDto, mdu, DataHandle.underlineToBigHump(entry.getKey()));
                }
            } else if (mdu.getLibraryName().equals("application.yml")) {
                data.put("url", requestParameterDto.getUrl());
                data.put("driver", requestParameterDto.getDriver());
                data.put("username", requestParameterDto.getUsername());
                data.put("password", requestParameterDto.getPassword());
                GenUtils.generatorCode(data, mdu.getLibraryContent(), requestParameterDto, mdu, "application");

            } else {
                for (Map.Entry<String, Map<String, List<String>>> entry : map.entrySet()) {
                    data.put("TableName", entry.getKey());
                    data.put("tableAttribute", entry.getValue());
                    GenUtils.generatorCode(data, mdu.getLibraryContent(), requestParameterDto, mdu, entry.getKey());
                }
            }
        }

        FileUtils.compressToZip(Constants.DECOMPRESSION + requestParameterDto.getArtifactId(), Constants.COMPRESS, requestParameterDto.getArtifactId() + ".zip");


        return true;
    }

    @Override
    public ResponseEntity<Object> downloadZip(RequestParameterDto requestParameterDto) {
        File file = new File(Constants.COMPRESS + requestParameterDto.getArtifactId() + ".zip");
        InputStreamResource resource = null;
        try {
            resource = new InputStreamResource( new FileInputStream( file ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add ( "Content-Disposition",String.format("attachment;filename=\"%s",requestParameterDto.getArtifactId())+".zip");
        headers.add ( "Cache-Control","no-cache,no-store,must-revalidate" );
        headers.add ( "Pragma","no-cache" );
        headers.add ( "Expires","0" );

        return ResponseEntity.ok()
                .headers ( headers )
                .contentLength ( file.length ())
                .contentType(MediaType.parseMediaType ( "application/octet-stream" ))
                .body(resource);


    }
}
































