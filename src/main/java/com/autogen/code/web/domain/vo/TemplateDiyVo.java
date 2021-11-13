package com.autogen.code.web.domain.vo;

import com.autogen.code.web.domain.TemplateDiyDomain;
import com.autogen.code.web.domain.TemplateManageDomain;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/14 00:01
 * @description：分页实体类 TemplateDiy
 * @modified By：
 * @version: 1.0
 */
public class TemplateDiyVo extends BaseTemplateVo{

    private List<TemplateDiyDomain> templateDiyDomains;

    public TemplateDiyVo(){}

    public TemplateDiyVo(Integer current, Integer size, Long total, List<TemplateManageDomain> templateManageDomainList, List<TemplateDiyDomain> templateDiyDomains) {
        super(current, size, total, templateManageDomainList);
        this.templateDiyDomains = templateDiyDomains;
    }

    public List<TemplateDiyDomain> getTemplateDiyDomains() {
        return templateDiyDomains;
    }

    public void setTemplateDiyDomains(List<TemplateDiyDomain> templateDiyDomains) {
        this.templateDiyDomains = templateDiyDomains;
    }
}
