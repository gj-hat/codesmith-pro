package com.testSpringBoot.Io;

import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.Constants;
import com.autogen.code.utils.DataHandle;
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

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

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


    @Test
    public void test1() throws IOException {
        String url = "https://start.springboot.io/starter.zip?type=maven-project&language=java&bootVersion=2.5.6&baseDir=BaseDir&groupId=com.gj&artifactId=AAA&name=JiaGuo&description=Description&packageName=com.gj.AAA&packageing=jar&javaVersion=11&dependencies=web,jdbc";

        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<byte[]> entity = restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers), byte[].class);
        byte[] body = entity.getBody();

        String proName = "BaseDir";
        String path = Constants.DOWN_PATH + proName;
        FileOutputStream outputStream = new FileOutputStream(path);





        assert body != null;
        outputStream.write(body);
        outputStream.close();



    }
}