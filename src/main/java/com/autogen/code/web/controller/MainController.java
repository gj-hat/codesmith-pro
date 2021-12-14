package com.autogen.code.web.controller;

import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.domain.vo.ManageDiyUnionQueryVO;
import com.autogen.code.web.service.Impl.MainServiceImpl;
import com.autogen.code.web.service.Impl.TemplateManageServiceImpl;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    @Autowired
    private TemplateManageServiceImpl templateManageService;


    // http://127.0.0.1:8080/main/requestParameter?type=maven-project&language=java&bootVersion=2.5.6&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,jdbc
    //http://127.0.0.1:8080/main/requestParameter?type=maven-project&language=java&bootVersion=2.5.6&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,postgresql,mybatis,jdbc&url=jdbc:postgresql://127.0.0.1:5432/postgres?currentSchema=public&driver=org.postgresql.Driver&username=postgres&password=321321
    //http://127.0.0.1:8080/main/requestParameter?type=maven-project&language=java&bootVersion=2.5.6&groupId=GroupId&artifactId=ArtifactId&name=Name&description=Description&packageName=PackageName&packageing=jar&javaVersion=11&dependencies=web,postgresql,mybatis,jdbc&url=jdbc:postgresql://10.254.130.27:5433/postgres?currentSchema=public&driver=org.postgresql.Driver&username=Gencode_Dev&password=postgres
    @RequestMapping("/requestParameter")
    public ResponseEntity<Object> dataSources(RequestParameterDto requestParameterDto) throws SQLException, ClassNotFoundException {

        mainService.downZip(requestParameterDto);
        mainService.handleZip(requestParameterDto.getArtifactId(), requestParameterDto.getPackageName());

        String templates = requestParameterDto.getTemplates();
        String[] splitTemp = templates.split(",");

        List<ManageDiyUnionQueryVO> manageDiyUnionQueryVOS = new ArrayList<>();
        for (String st : splitTemp) {
            manageDiyUnionQueryVOS.addAll(templateManageService.manageDiyUnionQueryByName(st));
        }
        mainService.analysisAndWrite(requestParameterDto, manageDiyUnionQueryVOS);
        return mainService.downloadZip(requestParameterDto);


    }
}




