package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 12:02
 * @description：提取实体类共同部分
 * @modified By：
 * @version: 1.0
 */

@Data
public class BaseTemplateDomain {


    @TableId(type = IdType.AUTO)
    private int templateId = 0;
    private String templateContent;
    private String packageName;
    @TableField(fill = FieldFill.INSERT) //创建时自动填充
    private String createTime = null;
    private String templateName;
    private String author;




}
