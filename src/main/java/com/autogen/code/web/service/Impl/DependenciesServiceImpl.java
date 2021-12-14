package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.autogen.code.web.mapper.DependenciesMapper;
import com.autogen.code.web.service.DependenciesService;
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
public class DependenciesServiceImpl extends ServiceImpl<DependenciesMapper, DependenciesDomain> implements DependenciesService {

    @Autowired
    DependenciesMapper dependenciesMapper;




    /**
     *
     * @param
     * @return
     */
//    public DependenciesVo findByPaging(ReqPageParam<SpDependencyEntity> reqPageParam) {
//        DependenciesVo templateDiyVo = new DependenciesVo();
//        IPage<DependenciesDomain> page = new Page<>(reqPageParam.getCurrent(), reqPageParam.getPagesize());
//        dependenciesMapper.selectPage(page, null);
//        templateDiyVo.setTotal(page.getTotal());
//        templateDiyVo.setDependenciesDomains(page.getRecords());
//        return templateDiyVo;
//    }

    @Override
    public DependenciesVo findByPaging(int pageNum) {
        DependenciesVo dependenciesVo = new DependenciesVo();
        IPage<DependenciesDomain> page = new Page<>(pageNum, Constants.RECORD);
        dependenciesMapper.selectPage(page, null);
        dependenciesVo.setCurrent(pageNum);
        dependenciesVo.setSize(10);
        dependenciesVo.setTotal(page.getTotal());
        dependenciesVo.setDependenciesDomains(page.getRecords());
        return dependenciesVo;

    }
}
