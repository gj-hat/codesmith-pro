package com.autogen.code.web.controller.dto;

import lombok.Data;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/7 19:09
 * @description：数据源视图类
 * @modified By：
 * @version: 1.0
 */
@Data
public class RequestParameterDto {
    //-----------DataSources---------------------------
    private String url;
    private String driver;
    private String username;
    private String password;
    // ----------SpringBoot-----------------
    private String type;
    private String language;
    private String bootVersion;
    private String groupId;
    private String artifactId;
    private String name;
    private String description;
    private String packageName;
    private String packageing;
    private String javaVersion;
    private String dependencies;
    private String templates;




    public String springBootRequestToString() {
        return   "type=" + type  +
                "&language=" + language  +
                "&bootVersion=" + bootVersion  +
                "&baseDir=" + artifactId  +
                "&groupId=" + groupId  +
                "&artifactId=" + artifactId  +
                "&name=" + name  +
                "&description=" + description  +
                "&packageName=" + packageName  +
                "&packageing=" + packageing  +
                "&javaVersion=" + javaVersion  +
                "&dependencies=" + dependencies;
    }



    public String dataSourcesToString() {
        return  "url=" + url  +
                "&drive=" + driver  +
                "&username=" + username  +
                "&password=" + password ;
    }


    @Override
    public String toString() {
        return "RequestParameterDto{" +
                "url='" + url + '\'' +
                ", drive='" + driver + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", bootVersion='" + bootVersion + '\'' +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packageing='" + packageing + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                ", dependencies='" + dependencies + '\'' +
                '}';
    }
}
