package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/16 18:37
 */
@TableName("\"Dependencies\"")
public class DependenciesDomain {

    @TableId
    private String id;


    private String name;

    // 描述
    private String description;

    // 组织
    @TableField("group_name")
    private String group;


    // 版本范围
    @TableField("version_range")
    private String versionRange;

    // 参考docs
    private String reference;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersionRange() {
        return versionRange;
    }

    public void setVersionRange(String versionRange) {
        this.versionRange = versionRange;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "DependenciesDomain{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", description='" + description + '\'' +
                ", versionRange='" + versionRange + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
