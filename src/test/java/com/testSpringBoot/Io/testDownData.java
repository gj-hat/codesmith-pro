package com.testSpringBoot.Io;

import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.domain.DependenciesDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/14 00:29
 * @description：测试爬取数据
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoGenCodeApplication.class)
public class testDownData {
    // 获取 http请求头,行,体
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RestTemplateUtils restTemplateUtils;

    @Test
    public void test1() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://start.spring.io/metadata/client", String.class);
        String body = responseEntity.getBody();
        HttpStatus statusCode = responseEntity.getStatusCode();
        int statusCodeValue = responseEntity.getStatusCodeValue();
        HttpHeaders headers = responseEntity.getHeaders();
        StringBuffer result = new StringBuffer();
        result.append("responseEntity.getBody()：").append(body).append("<hr>")
                .append("responseEntity.getStatusCode()：").append(statusCode).append("<hr>")
                .append("responseEntity.getStatusCodeValue()：").append(statusCodeValue).append("<hr>")
                .append("responseEntity.getHeaders()：").append(headers).append("<hr>");
        String s = result.toString();
        System.out.printf("s=", s);
    }

    @Test
    public void test2() {
//        ResponseEntity<DependenciesDomain> stringResponseEntity1 = restTemplate.postForEntity("https://start.spring.io", "dependencies", DependenciesDomain.class);
//        ResponseEntity<String> stringResponseEntity = restTemplateUtils.get("https://start.spring.io", String.class);
//        String s = stringResponseEntity.getBody();
//        System.out.println("s = " + s);


        ResponseEntity<DependenciesDomain> stringResponseEntity = restTemplateUtils.post("https://start.spring.io","dependencies" ,DependenciesDomain.class);
        DependenciesDomain s = stringResponseEntity.getBody();
        System.out.println("s = " + s);



    }

}
