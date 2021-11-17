package com.autogen.code.web.service.Impl;

import com.autogen.code.Constants;
import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.vo.TemplateDiyVo;
import com.autogen.code.web.mapper.TemplateDiyMapper;
import com.autogen.code.web.service.TemplateDiyService;
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
public class TemplateDiyServiceImpl extends ServiceImpl<TemplateDiyMapper, TemplateDiyDomain> implements TemplateDiyService {

    @Autowired
    TemplateDiyMapper templateDiyMapper;

    @Override
    public TemplateDiyVo findPaging(int pageNum) {
        TemplateDiyVo templateDiyVo = new TemplateDiyVo();
        IPage<TemplateDiyDomain> page = new Page<>(pageNum, Constants.RECORD);
        templateDiyMapper.selectPage(page, null);
        templateDiyVo.setCurrent(pageNum);
        templateDiyVo.setSize(2);
        templateDiyVo.setTotal(page.getTotal());
        templateDiyVo.setTemplateDiyDomains(page.getRecords());
        return templateDiyVo;
    }





}
