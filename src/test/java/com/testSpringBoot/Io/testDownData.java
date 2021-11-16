package com.testSpringBoot.Io;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.utils.RestTemplateUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void test2() throws JsonProcessingException {
//        ResponseEntity<DependenciesDomain> stringResponseEntity1 = restTemplate.postForEntity("https://start.spring.io", "dependencies", DependenciesDomain.class);
//        ResponseEntity<String> stringResponseEntity = restTemplateUtils.get("https://start.spring.io", String.class);
//        String s = stringResponseEntity.getBody();
//        System.out.println("s = " + s);


        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://start.spring.io/metadata/client", String.class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {

            JSONObject data = JSON.parseObject(responseEntity.getBody());


            System.out.println();


            JSONObject dependency = data.getJSONObject("dependencies");

            JSONObject dependenciesValues = dependency.getJSONObject("values");


            // todo Ryan 2021年11月16日  :  解析并入库 dependency 信息

        }


    }

}
