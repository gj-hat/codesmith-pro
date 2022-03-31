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
    private String url = null;
    private String driver = null;
    private String username = null;
    private String password = null;
    // ----------SpringBoot-----------------
    private String type = null;
    private String language = null;
    private String bootVersion = null;
    private String groupId = null;
    private String artifactId = null;
    private String name = null;
    private String description = null;
    private String packageName = null;
    private String packageing = null;
    private String javaVersion = null;
    private String dependencies = null;
    private String templates = null;




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
                ", driver='" + driver + '\'' +
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
                ", templates='" + templates + '\'' +
                '}';
    }
}
