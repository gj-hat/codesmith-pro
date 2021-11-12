package com.autogen.code.web.controller;

import com.autogen.code.web.controller.entity.User;
import com.autogen.code.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @Override
    public void afterPropertiesSet() throws Exception {

        log.debug("this is debug information log.");
        log.info("this is info information log.");
        log.warn("this is warn information log.");
        log.error("this is error information log.");


    }

    @RequestMapping("/list")
    public List<User> list() {
        return userService.list();
    }
    @RequestMapping("/save")
    public void save(@RequestBody User user) {
        userService.save();
    }
    @RequestMapping("/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @RequestMapping("/del")
    public void del(@RequestBody int[] ids) {
        userService.del(ids);
    }












}
