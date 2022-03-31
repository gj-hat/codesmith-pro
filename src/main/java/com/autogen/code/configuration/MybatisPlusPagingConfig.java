package com.autogen.code.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/13 23:20
 * @description：mybatis-plus分页配置
 * @modified By：
 * @version: 1.0
 */
@Configuration
@ConditionalOnClass(value = {PaginationInterceptor.class})
public class MybatisPlusPagingConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
