package com.autogen.code.web.service;

import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.vo.DependenciesVo;
import com.autogen.code.web.domain.vo.TemplateDiyVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 14:52
 * @description：interface TemplateDiy
 * @modified By：
 * @version: 1.0
 */
@Service
public interface DependenciesService extends IService<DependenciesDomain> {
    DependenciesVo findPaging(int pageNum);






}
