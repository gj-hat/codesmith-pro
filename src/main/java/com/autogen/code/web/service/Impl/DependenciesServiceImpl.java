package com.autogen.code.web.service.Impl;

import com.autogen.code.web.controller.dto.ReqPageParam;
import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.autogen.code.web.mapper.DependenciesMapper;
import com.autogen.code.web.mapper.mapper.SpDependencyEntity;
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
public class DependenciesServiceImpl extends ServiceImpl<DependenciesMapper, DependenciesDomain>  {

    @Autowired
    DependenciesMapper dependenciesMapper;

    /**
     *
     * @param reqPageParam
     * @return
     */
    public DependenciesVo findByPaging(ReqPageParam<SpDependencyEntity> reqPageParam) {
        DependenciesVo templateDiyVo = new DependenciesVo();


        IPage<DependenciesDomain> page = new Page<>(reqPageParam.getCurrent(), reqPageParam.getPagesize());


        dependenciesMapper.selectPage(page, null);



        templateDiyVo.setTotal(page.getTotal());
        templateDiyVo.setDependenciesDomains(page.getRecords());
        return templateDiyVo;
    }





}
