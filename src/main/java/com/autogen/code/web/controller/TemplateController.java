package com.autogen.code.web.controller;

import com.autogen.code.web.controller.dto.TemplateDto;
import com.autogen.code.web.domain.User;
import com.autogen.code.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class TemplateController implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(TemplateController.class);

    @Autowired
    private UserService userService;


    @Override
    public void afterPropertiesSet() throws Exception {

        log.debug("this is debug information log.");
        log.info("this is info information log.");
        log.warn("this is warn information log.");
        log.error("this is error information log.");


    }

    /**
     * 分页搜索模板列表
     *
     * @param reqPage
     * @return
     */
    @PostMapping("/list")
    public List<User> list(@RequestBody ReqPage<TemplateDto> reqPage) {


        return userService.list(reqPage);
    }


}
