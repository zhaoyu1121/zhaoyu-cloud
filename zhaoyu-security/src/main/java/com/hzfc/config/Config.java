package com.hzfc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName 配置
 * @DesCripion 配置信息
 * @Author zhaoYu
 * @Date 2024/11/10 22:00
 */
@Data
@Configuration
public class Config {

    @Value("${config.message}")
    private String message;
}
