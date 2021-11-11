package com.gjstudy.velocitystudy.web.mapper;

import com.gjstudy.velocitystudy.web.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> list();

    void save();

    void update(User user);

    void del(int[] ids);
}
