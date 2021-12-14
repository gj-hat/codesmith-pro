package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * templateManage实体类
 *
 *
 */
@Data
@TableName("\"template_manage\"")
public class TemplateManageDomain extends BaseTemplateDomain {



    private boolean delMark = false;

    private String templateType;

    private TemplateLibraryDomain templateLibraryDomain;

}
