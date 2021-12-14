package com.autogen.code.test.mapper;

import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.web.mapper.TemplateManageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/8 15:36
 * @modified By：
 * @version: 1.0
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoGenCodeApplication.class)
public class TemplateManageTest {


    @Autowired
    private TemplateManageMapper templateManageMapper;



    @Test
    public void test1() {
//        System.out.println("templateManageMapper.findId(1) = " + templateManageMapper.findId(1));
        System.out.println(" = " + templateManageMapper.manageDiyUnionQueryById(1));
//        System.out.println(" = " + templateManageMapper.manageDiyUnionQueryByName("mybatis-curd"));

    }


    @Test
    public void test2() {
//        System.out.println("templateManageMapper.findId(1) = " + templateManageMapper.findId(1));
        System.out.println(" = " + templateManageMapper.manageDiyUnionQueryByName("mybatis-curd"));
//        System.out.println(" = " + templateManageMapper.manageDiyUnionQueryByName("mybatis-curd"));

    }

}
