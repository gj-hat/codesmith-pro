package com.autogen.code.web.controller;


import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.service.TemplateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/templateManage")
public class TemplateManageController {

    @Autowired
    private TemplateManageService templateManageService;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestTemplateUtils restTemplateUtils;

    // 获取 http请求头,行,体
    @RequestMapping("/test1")
    public String test1() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://127.0.0.1:8080/templateManage/findNotAll", String.class);
        String body = responseEntity.getBody();
        HttpStatus statusCode = responseEntity.getStatusCode();
        int statusCodeValue = responseEntity.getStatusCodeValue();
        HttpHeaders headers = responseEntity.getHeaders();
        StringBuffer result = new StringBuffer();
        result.append("responseEntity.getBody()：").append(body).append("<hr>")
                .append("responseEntity.getStatusCode()：").append(statusCode).append("<hr>")
                .append("responseEntity.getStatusCodeValue()：").append(statusCodeValue).append("<hr>")
                .append("responseEntity.getHeaders()：").append(headers).append("<hr>");
        return result.toString();
    }
    @RequestMapping("/test2")
    public String test2() {
        ResponseEntity<String> stringResponseEntity = restTemplateUtils.get("http://127.0.0.1:8080/templateManage/findNotAll", String.class);
        return  stringResponseEntity.getBody();
    }

    //http://localhost:8080/templateManage/findNotAll
    @RequestMapping("/findNotAll")
    public List<TemplateManageDomain> findNotAll() {

        List<TemplateManageDomain> allService = templateManageService.findNotAllService();
        return allService;
    }

    //http://localhost:8080/templateManage/findAll
    @RequestMapping("/findAll")
    public List<TemplateManageDomain> findAll() {
        List<TemplateManageDomain> allService = templateManageService.findAllService();
        return allService;
    }

    //http://localhost:8080/templateManage/findId
    @RequestMapping("/findId")
    public List<TemplateManageDomain> findId(int templateId) {
        List<TemplateManageDomain> allService = templateManageService.findId(templateId);
        return allService;
    }


    //http://localhost:8080/templateManage/insert?className=class3&packageName=pack3&tableName=table3&templateContent=temp3&
    @GetMapping("/insert")
    public void insert(TemplateManageDomain templateManageDomain) {
        templateManageService.insertData(templateManageDomain);
    }

    // http://localhost:8080/templateManage/delId?templateId=2
    @GetMapping("/delId")
    public void delDataId(int templateId) {
        templateManageService.delDataId(templateId);
    }


    // http://localhost:8080/templateManage/update?templateId=2, className=class3&packageName=pack3&tableName=table3&templateContent=temp3
    // 参数需要  需要修改的id   实体类的这三属性className,packageName,tableName, templateContent
    @GetMapping("/update")
    public void upData(int templateId, TemplateManageDomain templateManageDomain) {
        templateManageService.upDate(templateId, templateManageDomain);
    }
}
