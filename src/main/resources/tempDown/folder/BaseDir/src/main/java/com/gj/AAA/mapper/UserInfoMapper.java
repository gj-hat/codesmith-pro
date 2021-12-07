package com.gj.AAA.web.mapper;
import com.gj.AAA.web.domain.*;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是Users的持久层
 * @modified By：
 * @version: 1.0
 */
@Repository
public interface UsersMapper {
    List<Users> list();
    void save();
    void update(Users users);
    void del(int[] ids);
}
