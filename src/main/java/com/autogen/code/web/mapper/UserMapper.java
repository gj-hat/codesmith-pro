package com.autogen.code.web.mapper;

import com.autogen.code.web.controller.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     *
     * @return
     */
    List<User> list();

    void save();

    void update(User user);

    void del(int[] ids);
}
