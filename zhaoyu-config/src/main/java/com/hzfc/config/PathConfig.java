package com.hzfc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 设置API接口请求统一前缀
 * Author: zhaoYu
 * Date: 2024/12/3
 */
@Configuration
public class PathConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/", c -> true);
    }
}
