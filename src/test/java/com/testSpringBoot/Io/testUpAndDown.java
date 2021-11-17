package com.testSpringBoot.Io;

import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.service.Impl.DependenciesServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 16:36
 * @description：发送请求到springBoot 返回一个压缩包
 * @modified By：
 * @version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoGenCodeApplication.class)
public class testUpAndDown {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RestTemplateUtils restTemplateUtils;
    @Autowired
    private DependenciesServiceImpl dependenciesService;

    @Test
    public void test1() throws IOException {
        String url = "https://start.springboot.io/starter.zip?type=maven-project&language=java&bootVersion=2.5.6&baseDir=BaseDir&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc";

        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<byte[]> entity = restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers), byte[].class);
        byte[] body = entity.getBody();

        FileOutputStream outputStream = new FileOutputStream("/Volumes/SoftWare/JetBrains/IDEA/codesmith-pro/src/main/resources/tempDown/temp.zip");

        assert body != null;
        outputStream.write(body);
        outputStream.close();



    }
}