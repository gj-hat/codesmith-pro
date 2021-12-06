package com.autogen.code.web.controller.dto;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/6 18:43
 * @description：springBoot请求参数Dto
 * @modified By：
 * @version: 1.0
 */
public class RequestSpringBootParaDto {

    private String type;
    private String language;
    private String bootVersion;
    private String baseDir;
    private String groupId;
    private String artifactId;
    private String name;
    private String description;
    private String packageName;
    private String packageing;
    private String javaVersion;
    private String dependencies;

    public RequestSpringBootParaDto() {
    }

    public RequestSpringBootParaDto(String type, String language, String bootVersion, String baseDir, String groupId, String artifactId, String name, String description, String packageName, String packageing, String javaVersion, String dependencies) {
        this.type = type;
        this.language = language;
        this.bootVersion = bootVersion;
        this.baseDir = baseDir;
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.name = name;
        this.description = description;
        this.packageName = packageName;
        this.packageing = packageing;
        this.javaVersion = javaVersion;
        this.dependencies = dependencies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBootVersion() {
        return bootVersion;
    }

    public void setBootVersion(String bootVersion) {
        this.bootVersion = bootVersion;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageing() {
        return packageing;
    }

    public void setPackageing(String packageing) {
        this.packageing = packageing;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return  "type=" + type + '&' +
                ", language='" + language + '&' +
                ", bootVersion='" + bootVersion + '&' +
                ", baseDir='" + baseDir + '&' +
                ", groupId='" + groupId + '&' +
                ", artifactId='" + artifactId + '&' +
                ", name='" + name + '&' +
                ", description='" + description + '&' +
                ", packageName='" + packageName + '&' +
                ", packageing='" + packageing + '&' +
                ", javaVersion='" + javaVersion + '&' +
                ", dependencies='" + dependencies + '&' ;
    }
}
