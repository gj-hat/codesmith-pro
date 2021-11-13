package com.autogen.code.web.mapper;

import com.autogen.code.web.domain.TemplateManageDomain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TemplateManageMapper  extends BaseMapper<TemplateManageDomain> {

//    Page<TemplateManageDomain> selectPageVo(Page<TemplateManageDomain> page);

//    public List<TemplateManageDomain> findAll();
//
//    public List<TemplateManageDomain> findNotAll();
//
//    public List<TemplateManageDomain> findId(int templateId);
//
//    public void insertData(TemplateManageDomain templateManageDomain);
//
//    public void delDataId(int templateId);
//
//    public void updateData(int templateId, TemplateManageDomain templateManageDomain);
}
