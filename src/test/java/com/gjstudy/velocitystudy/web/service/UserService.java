package com.gjstudy.velocitystudy.web.service;

import com.gjstudy.velocitystudy.web.domain.User;
import com.gjstudy.velocitystudy.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.list();
    }

    public void save() {
        userMapper.save();
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void del(int[] ids) {
        userMapper.del(ids);
    }
}
