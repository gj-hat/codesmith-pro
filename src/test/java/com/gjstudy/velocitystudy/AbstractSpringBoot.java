package com.gjstudy.velocitystudy;

import com.autogen.code.AutoGenCodeApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.net.URI;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 10:02
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoGenCodeApplication.class)
public abstract class AbstractSpringBoot {

    @Autowired
    private WebApplicationContext wac;


    private MockHttpSession session;


    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        session = new MockHttpSession();
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
     * @param uri
     * @param uriVars
     * @throws Exception
     * @return
     */
    public ResultActions get(URI uri, Object... uriVars) throws Exception {
        return mockMvc.perform(builerGet(uri.getPath(), uriVars));
    }
}
