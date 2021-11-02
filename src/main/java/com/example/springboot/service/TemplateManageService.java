package com.example.springboot.service;

import com.example.springboot.domain.TemplateManageDomain;
import com.example.springboot.mapper.TemplateManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TemplateManageService {

    @Autowired
    private TemplateManageMapper templateManageMapper;

    public List<TemplateManageDomain> findAllService(){
        return templateManageMapper.findAll();

    }

    public List<TemplateManageDomain> findNotAllService() {
        return templateManageMapper.findNotAll();
    }

    public List<TemplateManageDomain> findId(int templateId) {
        return templateManageMapper.findId(templateId);
    }

    public void insertData(TemplateManageDomain templateManageDomain) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String timeFor = formatter.format(date);
        templateManageDomain.setCreateTime(timeFor);
        System.out.println("---------------------");
        System.out.println(timeFor);
        System.out.println("---------------------");

        templateManageMapper.insertData(templateManageDomain);
    }


    public void delDataId(int templateId) {
        templateManageMapper.delDataId(templateId);
    }

    public void upDate(int templateId, TemplateManageDomain templateManageDomain) {
        templateManageMapper.updateData(templateId,templateManageDomain);
    }

}
