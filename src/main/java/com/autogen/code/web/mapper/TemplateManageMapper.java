package com.autogen.code.web.mapper;

import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.ManageDiyUnionQueryVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TemplateManageMapper  extends BaseMapper<TemplateManageDomain> {

    List<ManageDiyUnionQueryVO> manageDiyUnionQueryById(int id);

    TemplateDiyDomain findId(int id);
}
