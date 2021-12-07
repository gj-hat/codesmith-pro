package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * templateManage实体类
 *
 *
 */
@TableName("\"template_manage\"")
public class TemplateManageDomain extends BaseTemplateDomain {

    private String templateName;

    private String className;

    private boolean delMark = false;


    public TemplateManageDomain() {
    }


    public TemplateManageDomain(int templateId, String templateContent, String packageName, String createTime, String templateName, String className, boolean delMark) {
        super(templateId, templateContent, packageName, createTime);
        this.templateName = templateName;
        this.className = className;
        this.delMark = delMark;
    }



    public int getTemplateId() {
        return super.getTemplateId();
    }


    public String getTableName() {
        return templateName;
    }

    public void setTableName(String templateName) {
        this.templateName = templateName;
    }


    public String getTemplateContent() {
        return super.getTemplateContent();
    }

    public void setTemplateContent(String templateContent) {
        super.setTemplateContent(templateContent);
    }

    public String getPackageName() {
        return super.getPackageName();
    }


    public void setPackageName(String packageName) {
        super.setPackageName(packageName);
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public boolean isDelMark() {
        return delMark;
    }

    public void setDelMark(boolean delMark) {
        this.delMark = delMark;
    }

    public String getCreateTime() {
        return super.getCreateTime();
    }



}
