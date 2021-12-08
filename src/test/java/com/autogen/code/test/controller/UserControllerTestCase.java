package com.autogen.code.test.controller;

import com.autogen.code.AutoGenCodeApplication;
import com.autogen.code.test.AbstractSpringBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 11:11
 */



public class UserControllerTestCase extends AbstractSpringBoot {

    @Test
    public void test_student_query_list() throws Exception {

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/list");
        perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());


    }
}
