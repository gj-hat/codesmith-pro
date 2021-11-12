package com.autogen.code.web.service;

import com.autogen.code.web.controller.ReqPage;
import com.autogen.code.web.controller.dto.TemplateDto;
import com.autogen.code.web.domain.User;
import com.autogen.code.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list(ReqPage<TemplateDto> reqPage) {

        // 当前也
        int indexPage = reqPage.getIndexPage();

        // 每页显示条数
        int pageSize = reqPage.getPageSize();

        TemplateDto data = reqPage.getData();

        // todo Ryan 2021年11月12日 ： 构造查询条件，完成数据查询功能


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
