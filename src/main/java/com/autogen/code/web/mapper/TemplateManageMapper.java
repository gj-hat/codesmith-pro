package com.autogen.code.web.mapper;

import com.autogen.code.web.domain.TemplateManageDomain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TemplateManageMapper  extends BaseMapper<TemplateManageDomain> {
}
