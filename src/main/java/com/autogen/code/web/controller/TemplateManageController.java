package com.autogen.code.web.controller;


import com.autogen.code.utils.RestTemplateUtils;
import com.autogen.code.web.domain.vo.BaseTemplateVo;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.ManageDiyUnionQueryVO;
import com.autogen.code.web.service.Impl.TemplateManageServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/templateManage")
public class TemplateManageController {


    @Autowired
    private TemplateManageServiceImpl templateManageService;

    @Autowired
    private RestTemplateUtils restTemplateUtils;


    @RequestMapping("/idList")
    public List<ManageDiyUnionQueryVO> findById(int id) {


        return templateManageService.manageDiyUnionQueryById(id);
    }

    @RequestMapping("/findAll")
    public BaseTemplateVo findAll(int pageNum) {
        return templateManageService.findNotAllPaging(pageNum);
    }



    @RequestMapping("/findNotAll")
    public BaseTemplateVo findNotAll(int pageNum) {
        QueryWrapper<TemplateManageDomain> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("del_mark", false);
        return templateManageService.findNotAllPaging(pageNum);
    }

    @RequestMapping("/del")
    public void del(int delId) {
        TemplateManageDomain templateManageDomain = new TemplateManageDomain();
        templateManageDomain.setTemplateId(delId);
        templateManageDomain.setDelMark(true);
        templateManageService.updateById(templateManageDomain);
    }


    @RequestMapping("/insert")
    public void insert(TemplateManageDomain templateManageDomain) {
        templateManageService.save(templateManageDomain);
    }

    @RequestMapping("/update")
    public void update(TemplateManageDomain templateManageDomain) {
        UpdateWrapper<TemplateManageDomain> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("template_id", templateManageDomain.getTemplateId());
        templateManageService.update(templateManageDomain, updateWrapper);
    }
}
