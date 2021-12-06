package com.autogen.code.web.domain;


import com.baomidou.mybatisplus.annotation.TableName;

/**
 * templateDiy实体类
 */

@TableName("\"TemplateDiy\"")
public class TemplateDiyDomain extends BaseTemplateDomain {

    private String templateName;
    private String templateType;
    private String path;
    private String extensionName;
    private String prefixDefault;
    private String author;


    public TemplateDiyDomain() {
    }


    public TemplateDiyDomain(int templateId, String templateContent, String packageName, String createTime, String templateName, String templateType, String path, String extensionName, String prefixDefault, String author) {
        super(templateId, templateContent, packageName, createTime);
        this.templateName = templateName;
        this.templateType = templateType;
        this.path = path;
        this.extensionName = extensionName;
        this.prefixDefault = prefixDefault;
        this.author = author;
    }


    public int getTemplateId() {
        return super.getTemplateId();
    }


    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public String getPrefixDefault() {
        return prefixDefault;
    }

    public void setPrefixDefault(String prefixDefault) {
        this.prefixDefault = prefixDefault;
    }

    public String getCreateTime() {
        return super.getCreateTime();
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
