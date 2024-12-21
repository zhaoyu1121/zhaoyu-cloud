package com.hzfc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: zhaoYu
 * Date: 2024/12/3
 * Description: API 接口统一访问前缀
 */
@Configuration
public class PathConfig implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/", c -> true);
    }
}
