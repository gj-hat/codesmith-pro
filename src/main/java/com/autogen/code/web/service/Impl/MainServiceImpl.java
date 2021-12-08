package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.utils.FileUtils;
import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

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
        System.out.println("dataSourcesToString = " + requestParameterDto.dataSourcesToString());

        String url = rootUrl + requestParameterDto.springBootRequestToString();
        System.out.println("url = " + url);
        ResponseEntity<byte[]> entity = RestTemplateUtils.get(url, byte[].class);
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
     * @param artifactId   项目BaseDir
     * @param packageName  包名  小数点
     */
    @Override
    public boolean handleZip(String artifactId, String packageName) {
        String sourcePath = Constants.DOWN_PATH + artifactId + ".zip";
        String targetPath = Constants.DECOMPRESSION;
        FileUtils.decompressionToZip(sourcePath, targetPath);
        FileUtils.injectionFolder(artifactId, packageName);
        return true;
    }























}
