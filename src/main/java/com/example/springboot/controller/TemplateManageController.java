package com.example.springboot.controller;


import com.example.springboot.domain.TemplateManageDomain;
import com.example.springboot.service.TemplateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/templateManage")
public class TemplateManageController {
    @Autowired
    private TemplateManageService templateManageService;

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


    //带时间http://localhost:8080/templateManage/insert?className=class3&packageName=pack3&tableName=table3&templateContent=temp3&templateId=3&delMark=false&createTime=2021/10/14
    //不带时间http://localhost:8080/templateManage/insert?className=class3&packageName=pack3&tableName=table3&templateContent=temp3&templateId=3&delMark=false
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
    public void upData(int templateId, TemplateManageDomain templateManageDomain ) {
        templateManageService.upDate(templateId,templateManageDomain);
    }
}
