package com.autogen.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ryan
 */
@SpringBootApplication
@MapperScan("com.autogen.code.web.mapper")
public class AutoGenCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoGenCodeApplication.class, args);
    }

}
