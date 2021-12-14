package com.autogen.code.web.controller;

import com.autogen.code.web.domain.DependenciesDomain;
import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.service.Impl.DependenciesServiceImpl;
import com.autogen.code.web.service.Impl.TemplateManageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/10 08:56
 * @description：首页访问Controller
 * @modified By：
 * @version: 1.0
 */
@Controller

public class indexController {

    @Autowired
    private DependenciesServiceImpl dependenciesService;
    @Autowired
    private TemplateManageServiceImpl templateManageService;

    @RequestMapping("/aaa")
    public String index(Map map) {
        map.put("message", "获取用户信息");
        map.put("name", "张三");
        map.put("age", "24");
        return "templates/templateIndex.vm";
    }


    @RequestMapping("/index")
    public String index() {

//        List<DependenciesDomain> dependenciesDomainList = dependenciesService.list();
//        List<TemplateManageDomain> templateManageDomainList = templateManageService.list();

        Map<String, Map<String, String>> data = new HashMap<>();
        Map<String, String> depen = new HashMap<>();

        return "templateIndex";
    }


}
