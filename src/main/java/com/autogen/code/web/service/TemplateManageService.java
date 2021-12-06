package com.autogen.code.web.service;

import com.autogen.code.web.domain.vo.BaseTemplateVo;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.TemplateManageVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

public interface TemplateManageService  extends IService<TemplateManageDomain> {

    TemplateManageVo findNotAllPaging(int pageNum);


    TemplateManageVo findAllPaging(int pageNum);


}
