package com.gj.AAA.controller;
import com.gj.AAA.web.domain.Users;
import com.gj.AAA.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/17 17:45
 * @description： 表现层
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/list")
    public List<Users> list() {
        return users.list();
    }
    @RequestMapping("/save")
    public void save(@RequestBody Users users) {
            usersService.save();
    }
    @RequestMapping("/update")
    public void update(@RequestBody Users users) {
            usersService.update(users);
    }
    @RequestMapping("/del")
    public void del(@RequestBody int[] ids) {
            usersService.del(ids);
    }
}
