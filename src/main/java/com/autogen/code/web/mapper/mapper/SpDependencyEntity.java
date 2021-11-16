package com.autogen.code.web.mapper.mapper;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/16 18:37
 */
public class SpDependencyEntity {

    private String id;

    private String name;

    private String group;

    private String description;

    private String versionRange;

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
}
