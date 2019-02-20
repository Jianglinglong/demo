package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * @author Jiang
 * @date 2018/7/11
 * @time 12:01
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        boolean hasMappingForPattern = registry.hasMappingForPattern("/static/**");
        //这样会覆盖spring boot 默认配置
        //registry.addResourceHandler("/**").addResourceLocations("classpath:/mysource/");
        //这样才是添加新的静态资源
        registry.addResourceHandler("/mysouce/**").addResourceLocations("classpth:/mysource/");
        //        registry.addResourceHandler("/static/")
        //                .addResourceLocations("classpath:/static/**")
        //                .setCachePeriod(10)
        //                .resourceChain(true);

    }
}
