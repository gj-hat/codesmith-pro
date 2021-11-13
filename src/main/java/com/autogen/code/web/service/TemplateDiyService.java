package com.autogen.code.web.service;

import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.vo.BaseTemplateVo;
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
public interface TemplateDiyService extends IService<TemplateDiyDomain> {
    TemplateDiyVo findPaging(int pageNum);




}
