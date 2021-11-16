package com.autogen.code.web.service.Impl;

import com.autogen.code.globalVariable.GlobalVariable;
import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.autogen.code.web.domain.vo.TemplateDiyVo;
import com.autogen.code.web.mapper.DependenciesMapper;
import com.autogen.code.web.service.DependenciesService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 14:53
 * @description：实现 TemplateDiy
 * @modified By：
 * @version: 1.0
 */
@Service
@DS("slave_1")
public class DependenciesServiceImpl extends ServiceImpl<DependenciesMapper, DependenciesDomain> implements DependenciesService {

    @Autowired
    DependenciesMapper dependenciesMapper;

    @Override
    public DependenciesVo findPaging(int pageNum) {
        DependenciesVo templateDiyVo = new DependenciesVo();
        IPage<DependenciesDomain> page = new Page<>(pageNum, GlobalVariable.RECORD);
        dependenciesMapper.selectPage(page, null);
        templateDiyVo.setCurrent(pageNum);
        templateDiyVo.setSize(2);
        templateDiyVo.setTotal(page.getTotal());
        templateDiyVo.setDependenciesDomains(page.getRecords());
        return templateDiyVo;
    }





}
