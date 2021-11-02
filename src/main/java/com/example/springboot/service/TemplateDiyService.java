package com.example.springboot.service;

import com.example.springboot.domain.TemplateDiyDomain;
import com.example.springboot.mapper.TemplateDiyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TemplateDiyService {

    @Autowired
    private TemplateDiyMapper templateDiyMapper;

    public List<TemplateDiyDomain> findAllService() {
        return templateDiyMapper.findAll();
    }

    public List<TemplateDiyDomain> findId(int templateId) {
        return templateDiyMapper.findId(templateId);
    }



    public void insertData(TemplateDiyDomain templateDiyDomain) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String timeFor = formatter.format(date);
        templateDiyDomain.setCreateTime(timeFor);
        System.out.println("---------------------");
        System.out.println(timeFor);
        System.out.println("---------------------");

        templateDiyMapper.insertData(templateDiyDomain);
    }


    public void delDataId(int templateId) {
        templateDiyMapper.delDataId(templateId);
    }

    public void upDate(int inIndex, TemplateDiyDomain templateDiyDomain) {

        templateDiyMapper.updateData(inIndex, templateDiyDomain);
    }


}

