package com.autogen.code.web.service.Impl;

import com.autogen.code.globalVariable.GlobalVariable;
import com.autogen.code.web.domain.vo.BaseTemplateVo;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.TemplateManageVo;
import com.autogen.code.web.mapper.TemplateManageMapper;
import com.autogen.code.web.service.TemplateManageService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author     ：JiaGuo
 * @date       ：Created in 2021/11/13 18:00
 * @description：service实现类 templateManageService
 * @modified By：
 * @version:     1.0
 */
@Service
@DS("slave_1")
public class TemplateManageServiceImpl  extends ServiceImpl<TemplateManageMapper, TemplateManageDomain> implements TemplateManageService {


    @Autowired
    TemplateManageMapper templateManageMapper;

    @Override
    public TemplateManageVo findAllPaging(int pageNum) {
        TemplateManageVo templateVo = new TemplateManageVo();
        IPage<TemplateManageDomain> page = new Page<>(pageNum, GlobalVariable.RECORD);
        templateManageMapper.selectPage(page, null);
        templateVo.setCurrent(pageNum);
        templateVo.setSize(2);
        templateVo.setTotal(page.getTotal());
        templateVo.setTemplateManageDomainList(page.getRecords());
        return templateVo;
    }

//    public List<TemplateManageDomain> findNotAll(int pageNum) {
//        QueryWrapper<TemplateManageDomain> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("del_mark", false);
//        return templateManageService.list(queryWrapper);
//    }
    @Override
    public TemplateManageVo findNotAllPaging(int pageNum) {
        TemplateManageVo templateVo = new TemplateManageVo();
        IPage<TemplateManageDomain> page = new Page<>(pageNum, GlobalVariable.RECORD);
        QueryWrapper<TemplateManageDomain> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("del_mark", false);
        templateManageMapper.selectPage(page, queryWrapper);
        templateVo.setCurrent(pageNum);
        templateVo.setSize(2);
        templateVo.setTotal(page.getTotal());
        templateVo.setTemplateManageDomainList(page.getRecords());
        return templateVo;
    }

    //    @Override
//    public IPage<TemplateManageDomain> selectPageVo(Page<TemplateManageDomain> page) {
//        return templateManageMapper.selectPageVo(page);
//    }

//
//    @Override
//    public List<TemplateManageDomain> findNotAll() {
//        return ;
//    }
}
