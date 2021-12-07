package com.gj.AAA.web.service;
/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/2 17:20
 * @description：这是Users的业务层接口
 * @modified By：
 * @version: 1.0
 */
public interface UsersService {
    public List<Users> list() ;
    public void save() ;
    public void update(Users users);
    public void del(int[] ids);
}
