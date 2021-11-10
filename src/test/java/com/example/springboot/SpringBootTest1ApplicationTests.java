package com.example.springboot;

import com.autogen.code.web.domain.TemplateManageDomain;
import com.autogen.code.web.service.TemplateManageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = {AutoGenCodeApplication.class})
class AutoGenCodeApplication {

    @Test
    void contextLoads() {
    }

    @Autowired
    private TemplateManageService templateManageService;

    @Test
    public void testFindAll(){
        List<TemplateManageDomain> tempServiceAllService = templateManageService.findAllService();
        System.out.println("tempServiceAllService = " + tempServiceAllService);


    }

}
