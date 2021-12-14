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
public class ManageLibraryUnionQueryVO {


    //-----------------TemplateManage----------------------------
    private String manageName;
    private String manageAuthor;

    //----------------TemplateLibrary------------------------------------------
    private String libraryName;
    private String libraryContent;
    private String libraryExtension;
    private String libraryPrefix;

}
