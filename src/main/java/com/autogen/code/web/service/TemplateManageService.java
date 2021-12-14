package com.autogen.code.web.service;

import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.domain.vo.ManageLibraryUnionQueryVO;
import com.autogen.code.web.domain.vo.TemplateManageVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TemplateManageService  extends IService<TemplateManageDomain> {

    TemplateManageVo findNotAllPaging(int pageNum);


    TemplateManageVo findAllPaging(int pageNum);


    List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryById(int id);


    List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryByName(String name);

}
