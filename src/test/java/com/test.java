package com;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/9 17:38
 * @description：纯瞎测试
 * @modified By：
 * @version: 1.0
 */
public class test {




    @Test
    public void test1(){
        String dependencies = "web,postgresql,mybatis-plus,jdbc";
        String[] split = dependencies.split(",");
        for (String a : split) {
            System.out.println("a = " + a);

        }
        boolean postgresql = ArrayUtils.contains(split, "mybatis-");
        System.out.println("postgresql = " + postgresql);


    }
}
