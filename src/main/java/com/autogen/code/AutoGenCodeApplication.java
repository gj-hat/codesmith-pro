package com.autogen.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Ryan
 */
@SpringBootApplication
@MapperScan("com.autogen.code.web.mapper")
//@ComponentScan("com.autogen.code.web")
public class AutoGenCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoGenCodeApplication.class, args);
    }

}
