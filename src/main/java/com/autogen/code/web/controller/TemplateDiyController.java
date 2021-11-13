package com.autogen.code.web.controller;


import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.vo.BaseTemplateVo;
import com.autogen.code.web.domain.vo.TemplateDiyVo;
import com.autogen.code.web.service.Impl.TemplateDiyServiceImpl;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/templateDiy")
public class TemplateDiyController {

    @Autowired
    private TemplateDiyServiceImpl templateDiyService;

    /**
     * 分页查找
     * @param pageNum   页数
     * @return
     */
    @RequestMapping("/findAll")
    public TemplateDiyVo findAll(int pageNum) {
        return templateDiyService.findPaging(pageNum);
    }

    @RequestMapping("/del")
    public void del(int delId){
        templateDiyService.removeById(delId);
    }


    @RequestMapping("/insert")
    public void insert(TemplateDiyDomain templateDiyDomain) {
        templateDiyService.save(templateDiyDomain);
    }

    @RequestMapping("/update")
    public void update(TemplateDiyDomain templateDiyDomain){
        UpdateWrapper<TemplateDiyDomain> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("template_id", templateDiyDomain.getTemplateId());
        templateDiyService.update(templateDiyDomain, updateWrapper);
    }


//    //http://localhost:8080/templateDiy/findAll
//    @RequestMapping("/findAll")
//    public List<TemplateDiyDomain> findAll() {
//        List<TemplateDiyDomain> allService = templateDiyService.findAllService();
//        return allService;
//    }
//
//    //http://localhost:8080/templateManage/findId
//    @RequestMapping("/findId")
//    public List<TemplateDiyDomain> findId(int templateId) {
//        List<TemplateDiyDomain> allService = templateDiyService.findId(templateId);
//        return allService;
//    }
//
//    //http://localhost:8080/templateDiy/insert?templateName=t1&templateType=templateType3&templateContent=templateContent3&packageName=packageName3&path=path3&extensionName=extensionName3&prefixDefault=prefixDefault3&author=author3
//    @GetMapping("/insert")
//    public void insert(TemplateDiyDomain templateDiyDomain) {
//        templateDiyService.insertData(templateDiyDomain);
//    }
//
//    // http://localhost:8080/templateDiy/delId?templateId=2
//    @GetMapping("/delId")
//    public void delDataId(int templateId) {
//        templateDiyService.delDataId(templateId);
//    }
//
//
//    // http://localhost:8080/templateDiy/update?templateId=2, templateType=templateType3&templateContent=templateContent3&packageName=packageName3&path=path3&extensionName=extensionName3&prefixDefault=prefixDefault3&author=author3
//    // 参数需要  需要修改的id   实体类的这八个属性templateName,templateType ,templateContent, packageName, path, extensionName, prefixDefault, author
//    @GetMapping("/update")
//    public void upData(int templateId, TemplateDiyDomain templateDiyDomain) {
//        templateDiyService.upDate(templateId, templateDiyDomain);
//    }
}
