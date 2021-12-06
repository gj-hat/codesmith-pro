package com.autogen.code.web.controller;


import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.vo.TemplateDiyVo;
import com.autogen.code.web.service.Impl.TemplateDiyServiceImpl;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/templateDiy")
public class TemplateDiyController {

    @Autowired
    private TemplateDiyServiceImpl templateDiyService;

    /**
     * 分页查找
     * @param pageNum   页数
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
}
