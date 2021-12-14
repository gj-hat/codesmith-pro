package com.autogen.code.web.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/16 18:37
 */
@TableName("\"dependencies\"")
public class DependenciesDomain {

    @TableId
    private String id;


    private String name;

    // 描述
    private String description;

    // 组织
    @TableField("group_name")
    private String group;


    private String sourceType;

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

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public DependenciesDomain() {
    }

    public DependenciesDomain(String id, String name, String description, String group, String sourceType, String versionRange, String reference) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.group = group;
        this.sourceType = sourceType;
        this.versionRange = versionRange;
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "DependenciesDomain{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", group='" + group + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", versionRange='" + versionRange + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
