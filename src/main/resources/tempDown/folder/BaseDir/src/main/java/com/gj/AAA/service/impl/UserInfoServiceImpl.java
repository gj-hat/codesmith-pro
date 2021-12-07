package com.gj.AAA.web.service.impl;


import com.gj.AAA.web.domain.*;
import com.gj.AAA.web.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是Users的业务层实现
 * @modified By：
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    public List<Users> list() {
        return usersMapper.list();
    }
    public void save() {
        usersMapper.save()};
    }
    public void update(Users users) {
        usersMapper.update(users)};
    }
    public void del(int[] ids) {
        usersMapper.del(ids)};
    }
}
