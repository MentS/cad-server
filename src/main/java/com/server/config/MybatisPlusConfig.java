package com.server.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author SH
 * @date 2019/9/22
 */

@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    public PerformanceInterceptorInterceptoreInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        //格式化sql语句
//        Properties properties = new Properties();
//        properties.setProperty("format", "true");
//        performanceInterceptor.setProperties(properties);
//        return performanceInterceptor;
//    }

}
