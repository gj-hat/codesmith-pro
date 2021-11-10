package com.autogen.code.web.domain;

public class TemplateManageDomain {

    private int templateId;

    private String tableName;

    private String templateContent;

    private String className;

    private String packageName;

    private boolean delMark = false;

    private String createTime;


    public TemplateManageDomain() {
    }

    public TemplateManageDomain(int templateId, String tableName, String templateContent, String className, String packageName, boolean delMark, String createTime) {
        this.templateId = templateId;
        this.tableName = tableName;
        this.templateContent = templateContent;
        this.className = className;
        this.packageName = packageName;
        this.delMark = delMark;
        this.createTime = createTime;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isDelMark() {
        return delMark;
    }

    public void setDelMark(boolean delMark) {
        this.delMark = delMark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }




}
