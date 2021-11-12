package com.autogen.code.web.mapper;

import com.autogen.code.web.controller.vo.TemplateVo;
import com.autogen.code.web.mapper.entity.TemplateEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;


/**
 *
 */
public interface TemplateMapper extends BaseMapper<TemplateEntity> {


    public List<TemplateVo> queryTemplateList(Page page);

}
