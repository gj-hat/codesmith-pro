package com.autogen.code.web.mapper;

import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.ManageLibraryUnionQueryVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TemplateManageMapper  extends BaseMapper<TemplateManageDomain> {

    List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryById(@Param("id") int id);
    List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryByName(@Param("name") String name);


}
