package com.autogen.code.web.mapper;

import com.autogen.code.web.domain.TemplateDiyDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateDiyMapper {

    public List<TemplateDiyDomain> findAll();

    List<TemplateDiyDomain> findId(int templateId);

    public void insertData(TemplateDiyDomain templateDiyDomain);


    public void delDataId(int templateId);

    public void updateData(int idIndex, TemplateDiyDomain templateDiyDomain);



}
