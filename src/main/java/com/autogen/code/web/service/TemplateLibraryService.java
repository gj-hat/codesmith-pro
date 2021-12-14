package com.autogen.code.web.service;

import com.autogen.code.web.domain.TemplateLibraryDomain;
import com.autogen.code.web.domain.vo.TemplateLibraryVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 14:52
 * @description：interface TemplateLibrary
 * @modified By：
 * @version: 1.0
 */
public interface TemplateLibraryService extends IService<TemplateLibraryDomain> {
    TemplateLibraryVo findPaging(int pageNum);




}
