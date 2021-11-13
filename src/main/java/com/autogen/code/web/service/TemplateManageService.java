package com.autogen.code.web.service;

import com.autogen.code.web.domain.vo.BaseTemplateVo;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.TemplateManageVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

@Service
public interface TemplateManageService  extends IService<TemplateManageDomain> {

    TemplateManageVo findNotAllPaging(int pageNum);


    TemplateManageVo findAllPaging(int pageNum);


//    @Autowired
//    private TemplateManageMapper templateManageMapper;
//
//
//    public List<TemplateManageDomain> findAllService(){
//        return templateManageMapper.findAll();
//
//    }
//
//    public List<TemplateManageDomain> findNotAllService() {
//        return templateManageMapper.findNotAll();
//    }
//
//    public List<TemplateManageDomain> findId(int templateId) {
//        return templateManageMapper.findId(templateId);
//    }
//
//    public void insertData(TemplateManageDomain templateManageDomain) {
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        String timeFor = formatter.format(date);
//        templateManageDomain.setCreateTime(timeFor);
//        templateManageMapper.insertData(templateManageDomain);
//    }
//
//
//    public void delDataId(int templateId) {
//        templateManageMapper.delDataId(templateId);
//    }
//
//    public void upDate(int templateId, TemplateManageDomain templateManageDomain) {
//        templateManageMapper.updateData(templateId,templateManageDomain);
//    }

}
