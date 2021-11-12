package com.autogen.code.test;

import com.autogen.code.AutoGenCodeApplication;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 10:02
 */
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoGenCodeApplication.class)
public abstract class AbstractSpringBoot {

    @Autowired
    private WebApplicationContext wac;


    private MockHttpSession session;


    @Autowired
    private MockMvc mockMvc;

    @BeforeAll
    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
//        session = new MockHttpSession();
    }


    /**
     * @param uri
     * @param uriVars
     * @return
     */
    public RequestBuilder builerGet(String uri, Object... uriVars) {
        return MockMvcRequestBuilders.get(uri, uriVars);
    }


    /**
     * @param requestBuilder
     * @return
     * @throws Exception
     */
    public ResultActions perform(RequestBuilder requestBuilder) throws Exception {
        return mockMvc.perform(requestBuilder);
    }

    /**
     *
     * @param requestBuilder
     * @return
     * @throws Exception
     */
    public ResultActions performAndExpect(RequestBuilder requestBuilder) throws Exception {
        return mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());

        // junit5
    }
}
