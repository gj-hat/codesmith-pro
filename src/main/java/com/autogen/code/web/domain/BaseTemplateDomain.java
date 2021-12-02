package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.*;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 12:02
 * @description：提取实体类共同部分
 * @modified By：
 * @version: 1.0
 */

public class BaseTemplateDomain {

    //@TableId("templateId")
    //@TableField(value = "templateId")
    @TableId(type = IdType.AUTO)
    private int templateId = 0;
    private String templateContent;
    private String packageName;
    @TableField(fill = FieldFill.INSERT) //创建时自动填充
    private String createTime = null;


    public BaseTemplateDomain() {
    }


    public BaseTemplateDomain(int templateId, String templateContent, String packageName, String createTime) {
        this.templateId = templateId;
        this.templateContent = templateContent;
        this.packageName = packageName;
        this.createTime = createTime;
    }



    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


}
