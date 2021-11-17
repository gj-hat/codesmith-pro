package com.autogen.code.web.service;

import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 14:52
 * @description：interface TemplateDiy
 * @modified By：
 * @version: 1.0
 */
public interface DependenciesService extends IService<DependenciesDomain> {
    //    DependenciesVo findByPaging(ReqPageParam<SpDependencyEntity> reqPageParam);
    DependenciesVo findByPaging(int numPage);


}
