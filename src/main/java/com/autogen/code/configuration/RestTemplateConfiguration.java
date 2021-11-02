package com.autogen.code.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/2 14:23
 */
@Configuration
public class RestTemplateConfiguration {



    @Bean
    public RestTemplate newRestTemplate() {
        return new RestTemplate();
    }
}
