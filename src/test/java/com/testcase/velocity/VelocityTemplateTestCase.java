package com.testcase.velocity;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


/**
 *
 */
public class VelocityTemplateTestCase {

    private static final Logger log = LoggerFactory.getLogger(VelocityTemplateTestCase.class);


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {


    }

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }


    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    @DisplayName("模板测试")
    @Test
    public void test_template() throws Exception {

        System.out.println("starting ");

        //    >/dev/null

        TimeUnit.SECONDS.sleep(3);

        System.out.println("launch success.");

    }
}
