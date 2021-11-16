package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/16 17:06
 * @description：springBoot官方依赖实体类
 * @modified By：
 * @version: 1.0
 */
public class DependenciesDomain {

    @TableId(type = IdType.AUTO)
    private String id;
    private String description;
    private String reqired_version;


    public DependenciesDomain() {
    }

    public DependenciesDomain(String id, String description, String reqired_version) {
        this.id = id;
        this.description = description;
        this.reqired_version = reqired_version;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReqired_version() {
        return reqired_version;
    }

    public void setReqired_version(String reqired_version) {
        this.reqired_version = reqired_version;
    }
}
