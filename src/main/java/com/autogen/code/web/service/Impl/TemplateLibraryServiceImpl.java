package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.web.domain.TemplateLibraryDomain;
import com.autogen.code.web.domain.vo.TemplateLibraryVo;
import com.autogen.code.web.mapper.TemplateLibraryMapper;
import com.autogen.code.web.service.TemplateLibraryService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 14:53
 * @description：实现 TemplateLibrary
 * @modified By：
 * @version: 1.0
 */
@Service
public class TemplateLibraryServiceImpl extends ServiceImpl<TemplateLibraryMapper, TemplateLibraryDomain> implements TemplateLibraryService {

    @Autowired
    TemplateLibraryMapper templateLibraryMapper;

    @Override
    public TemplateLibraryVo findPaging(int pageNum) {
        TemplateLibraryVo templateLibraryVo = new TemplateLibraryVo();
        IPage<TemplateLibraryDomain> page = new Page<>(pageNum, Constants.RECORD);
        templateLibraryMapper.selectPage(page, null);
        templateLibraryVo.setCurrent(pageNum);
        templateLibraryVo.setSize(2);
        templateLibraryVo.setTotal(page.getTotal());
        templateLibraryVo.setTemplateLibraryDomains(page.getRecords());
        return templateLibraryVo;
    }





}
