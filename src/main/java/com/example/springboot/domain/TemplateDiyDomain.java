package com.example.springboot.domain;

public class TemplateDiyDomain {

    private int templateId;
    private String templateType;
    private String templateContent;
    private String packageName;
    private String path;
    private String extensionName;
    private String prefixDefault;
    private String createTime;
    private String author;

    public TemplateDiyDomain() {
    }

    public TemplateDiyDomain(int templateId, String templateType, String templateContent, String packageName, String path, String extensionName, String prefixDefault, String createTime, String author) {
        this.templateId = templateId;
        this.templateType = templateType;
        this.templateContent = templateContent;
        this.packageName = packageName;
        this.path = path;
        this.extensionName = extensionName;
        this.prefixDefault = prefixDefault;
        this.createTime = createTime;
        this.author = author;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
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
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "templateDiyDomain{" +
                "templateId=" + templateId +
                ", templateType='" + templateType + '\'' +
                ", templateContent='" + templateContent + '\'' +
                ", packageName='" + packageName + '\'' +
                ", path='" + path + '\'' +
                ", extensionName='" + extensionName + '\'' +
                ", prefixDefault='" + prefixDefault + '\'' +
                ", createTime='" + createTime + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
