package com.autogen.code.web.controller;

import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.controller.dto.RequestSpringBootParaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 17:45
 * @description：请求SpringBoot  下载初始Zip包 并解压
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/requestDown")
public class RequestSpringBootController {

    @Autowired
    private RestTemplateUtils restTemplateUtils;

    @RequestMapping("/downZip")
    public void downZip(RequestSpringBootParaDto springBootParaDto) {
        String rootUrl = "https://start.springboot.io/starter.zip?";
        // http://127.0.0.1:8080/requestDown/downZip?type=maven-project&language=java&bootVersion=2.5.6&baseDir=BaseDir&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc
        // String url = "https://start.springboot.io/starter.zip?type=maven-project&language=java&bootVersion=2.5.6&baseDir=BaseDir&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc";

        String url = rootUrl + springBootParaDto.toString();
        ResponseEntity<byte[]> entity = RestTemplateUtils.get(url, byte[].class);
        byte[] body = entity.getBody();

        String zipPath = "/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/main/resources/tempDown/zip/temp.zip";
        String folderPath = "/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/main/resources/tempDown/folder";
        try {
            FileOutputStream outputStream = new FileOutputStream(zipPath);
            assert body != null;
            outputStream.write(body);
            outputStream.close();
            File srcFile = new File(zipPath);//获取当前压缩文件
            //开始解压
            //构建解压输入流
            ZipInputStream zIn = new ZipInputStream(new FileInputStream(srcFile));
            ZipEntry entry = null;
            File file = null;
            while ((entry = zIn.getNextEntry()) != null) {
                if (!entry.isDirectory()) {
                    file = new File(folderPath, entry.getName());
                    if (!file.exists()) {
                        new File(file.getParent()).mkdirs();//创建此文件的上级目录
                    }
                    System.out.println("--------------");

                    OutputStream out = new FileOutputStream(file);
                    BufferedOutputStream bos = new BufferedOutputStream(out);
                    int len = -1;
                    byte[] buf = new byte[1024];
                    while ((len = zIn.read(buf)) != -1) {
                        bos.write(buf, 0, len);
                    }
                    bos.close();
                    out.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
