package com.autogen.code.web.mapper.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 17:32
 */
public class TemplateEntity  extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long templateId;

    private String templateName;


    // todo Ryan 2021年11月12日 ： 补充模板字段


    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
