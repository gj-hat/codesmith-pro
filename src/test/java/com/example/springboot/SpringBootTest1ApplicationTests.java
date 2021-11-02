package com.example.springboot;

import com.example.springboot.domain.TemplateManageDomain;
import com.example.springboot.service.TemplateManageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = {SpringBootTest1Application.class})
class SpringBootTest1ApplicationTests {

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
