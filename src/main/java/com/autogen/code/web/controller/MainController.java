package com.autogen.code.web.controller;

import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.service.Impl.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 17:45
 * @description：请求SpringBoot 下载初始Zip包 并解压
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/main")
public class MainController {


    @Autowired
    private MainServiceImpl mainService;


    // http://127.0.0.1:8080/main/requestParameter?type=maven-project&language=java&bootVersion=2.5.6&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc
    //http://127.0.0.1:8080/main/requestParameter?type=maven-project&language=java&bootVersion=2.5.6&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc&url=jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public&driver=org.postgresql.Driver&username=postgres&password=321321
    @RequestMapping("/requestParameter")
    public Boolean dataSources(RequestParameterDto requestParameterDto) {

        // 下载源包
        mainService.downZip(requestParameterDto);
        // 处理原包  解压 新增基础文件夹
        mainService.handleZip(requestParameterDto.getArtifactId(), requestParameterDto.getPackageName());


        String dependencies = requestParameterDto.getDependencies();

        // TODO: 2021/12/8  加入Controller


        if (dependencies.contains("postgresql") && dependencies.contains("mybatis") && !requestParameterDto.dataSourcesToString().isEmpty()) {
            // TODO: 2021/12/8    调用template-Manage业务方法  获取templateDiy belong=1的列集合
            int a = 1;
        } else if (dependencies.contains("postgresql") && dependencies.contains("mybatis-plus")&& !requestParameterDto.dataSourcesToString().isEmpty()) {
            // TODO: 2021/12/8  调用template-Manage业务方法  获取templateDiy belong=2的列集合
            int a = 2;

        } else if (dependencies.contains("mysql") && dependencies.contains("mybatis")&& !requestParameterDto.dataSourcesToString().isEmpty()) {
            // TODO: 2021/12/8  调用template-Manage业务方法  获取templateDiy belong=1的列集合
            int a = 3;

        } else if (dependencies.contains("mysql") && dependencies.contains("mybatis-plus")&& !requestParameterDto.dataSourcesToString().isEmpty()) {
            // TODO: 2021/12/8  调用template-Manage业务方法  获取templateDiy belong=2的列集合
            int a = 4;

        }


        return false;

    }

}
