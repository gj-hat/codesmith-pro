package com.autogen.code.web.domain.vo;

import com.autogen.code.web.domain.TemplateLibraryDomain;
import com.autogen.code.web.domain.TemplateManageDomain;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/14 00:01
 * @description：分页实体类 TemplateLibrary
 * @modified By：
 * @version: 1.0
 */
public class TemplateLibraryVo extends BaseTemplateVo{

    private List<TemplateLibraryDomain> templateLibraryDomains;

    public TemplateLibraryVo(){}

    public TemplateLibraryVo(Integer current, Integer size, Long total, List<TemplateManageDomain> templateManageDomainList, List<TemplateLibraryDomain> templateLibraryDomains) {
        super(current, size, total, templateManageDomainList);
        this.templateLibraryDomains = templateLibraryDomains;
    }

    public List<TemplateLibraryDomain> getTemplateLibraryDomains() {
        return templateLibraryDomains;
    }

    public void setTemplateLibraryDomains(List<TemplateLibraryDomain> templateLibraryDomains) {
        this.templateLibraryDomains = templateLibraryDomains;
    }
}
