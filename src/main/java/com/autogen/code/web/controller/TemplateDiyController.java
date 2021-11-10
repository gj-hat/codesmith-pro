package com.autogen.code.web.controller;


import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.service.TemplateDiyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/templateDiy")
public class TemplateDiyController {

    @Autowired
    private TemplateDiyService templateDiyService;


    @RequestMapping("/test1")
    public String test1(){
        return "我是测试";
    }

    //http://localhost:8080/templateDiy/findAllhttp://localhost:8080/templateDiy/findAll
    @RequestMapping("/findAll")
    public List<TemplateDiyDomain> findAll() {
        List<TemplateDiyDomain> allService = templateDiyService.findAllService();
        return allService;
    }

    //http://localhost:8080/templateManage/findId
    @RequestMapping("/findId")
    public List<TemplateDiyDomain> findId(int templateId) {
        List<TemplateDiyDomain> allService = templateDiyService.findId(templateId);
        return allService;
    }

    //http://localhost:8080/templateDiy/insert?templateName=t1&templateType=templateType3&templateContent=templateContent3&packageName=packageName3&path=path3&extensionName=extensionName3&prefixDefault=prefixDefault3&author=author3
    @GetMapping("/insert")
    public void insert(TemplateDiyDomain templateDiyDomain) {
        templateDiyService.insertData(templateDiyDomain);
    }

    // http://localhost:8080/templateDiy/delId?templateId=2
    @GetMapping("/delId")
    public void delDataId(int templateId) {
        templateDiyService.delDataId(templateId);
    }


    // http://localhost:8080/templateDiy/update?templateId=2, templateType=templateType3&templateContent=templateContent3&packageName=packageName3&path=path3&extensionName=extensionName3&prefixDefault=prefixDefault3&author=author3
    // 参数需要  需要修改的id   实体类的这八个属性templateName,templateType ,templateContent, packageName, path, extensionName, prefixDefault, author
    @GetMapping("/update")
    public void upData(int templateId, TemplateDiyDomain templateDiyDomain) {
        templateDiyService.upDate(templateId, templateDiyDomain);
    }
}
