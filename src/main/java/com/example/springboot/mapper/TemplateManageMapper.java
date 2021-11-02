package com.example.springboot.mapper;

import com.example.springboot.domain.TemplateManageDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateManageMapper {

    public List<TemplateManageDomain> findAll();

    public List<TemplateManageDomain> findNotAll();

    public List<TemplateManageDomain> findId(int templateId);

    public void insertData(TemplateManageDomain templateManageDomain);

    public void delDataId(int templateId);

    public void updateData(int templateId, TemplateManageDomain templateManageDomain);
}
