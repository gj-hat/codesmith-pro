package com.autogen.code.web.controller;


import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.service.TemplateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    //http://localhost:8080/templateManage/insert?className=class3&packageName=pack3&tableName=table3&templateContent=temp3&templateId=3&delMark=false
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
