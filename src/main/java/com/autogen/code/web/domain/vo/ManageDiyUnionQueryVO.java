package com.autogen.code.web.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/8 14:11
 * @description：模板manage和diy表多表查询
 * @modified By：
 * @version: 1.0
 */
@Data
public class ManageDiyUnionQueryVO {


    //-----------------TemplateManage----------------------------
    private String manageName;
    private String manageAuthor;

    //----------------TemplateDiy------------------------------------------
    private String diyName;
    private String diyContent;
    private String diyExtension;
    private String diyPrefix;

}
