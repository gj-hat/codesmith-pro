package com.autogen.code.web.domain.vo;

import com.autogen.code.web.domain.TemplateManageDomain;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 23:56
 * @description：分页实体类 TemplateManage
 * @modified By：
 * @version: 1.0
 */
public class TemplateManageVo extends BaseTemplateVo {

    private List<TemplateManageDomain> templateManageDomainList;

    public TemplateManageVo(){}

    public TemplateManageVo(Integer current, Integer size, Long total, List<TemplateManageDomain> templateManageDomainList, List<TemplateManageDomain> templateManageDomainList1) {
        super(current, size, total, templateManageDomainList);
        this.templateManageDomainList = templateManageDomainList1;
    }

    public List<TemplateManageDomain> getTemplateManageDomainList() {
        return templateManageDomainList;
    }

    public void setTemplateManageDomainList(List<TemplateManageDomain> templateManageDomainList) {
        this.templateManageDomainList = templateManageDomainList;
    }
}
