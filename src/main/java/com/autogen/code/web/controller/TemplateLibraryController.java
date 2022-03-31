package com.autogen.code.web.controller;


import com.autogen.code.web.domain.TemplateLibraryDomain;
import com.autogen.code.web.domain.vo.TemplateLibraryVo;
import com.autogen.code.web.service.Impl.TemplateLibraryServiceImpl;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/templateLibrary")
public class TemplateLibraryController {

    @Autowired
    private TemplateLibraryServiceImpl templateLibraryService;

    /**
     * 分页查找
     * @param pageNum   页数
     */
    @RequestMapping("/list")
    public TemplateLibraryVo findAll(int pageNum) {
        return templateLibraryService.findPaging(pageNum);
    }

    @RequestMapping("/del")
    public void del(int delId){
        templateLibraryService.removeById(delId);
    }


    @RequestMapping("/insert")
    public void insert(TemplateLibraryDomain templateLibraryDomain) {
        templateLibraryService.save(templateLibraryDomain);
    }

    @RequestMapping("/update")
    public void update(TemplateLibraryDomain templateLibraryDomain){
        UpdateWrapper<TemplateLibraryDomain> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("template_id", templateLibraryDomain.getTemplateId());
        templateLibraryService.update(templateLibraryDomain, updateWrapper);
    }
}
