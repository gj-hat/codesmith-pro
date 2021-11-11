package com.gjstudy.velocitystudy.web.controller;

import com.gjstudy.velocitystudy.web.domain.User;
import com.gjstudy.velocitystudy.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


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
