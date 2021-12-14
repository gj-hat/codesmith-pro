package com.autogen.code.web.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * templateLibrary实体类
 */
@Data
@TableName("\"template_library\"")
public class TemplateLibraryDomain extends BaseTemplateDomain {

    private String templateName;
    private String templateType;
    private String path;
    private String extensionName;
    private String prefixDefault;

    private int belong;




}
