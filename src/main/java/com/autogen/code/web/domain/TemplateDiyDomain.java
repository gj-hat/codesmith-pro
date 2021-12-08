package com.autogen.code.web.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * templateDiy实体类
 */
@Data
@TableName("\"template_diy\"")
public class TemplateDiyDomain extends BaseTemplateDomain {

    private String templateName;
    private String templateType;
    private String path;
    private String extensionName;
    private String prefixDefault;

    private int belong;




}
