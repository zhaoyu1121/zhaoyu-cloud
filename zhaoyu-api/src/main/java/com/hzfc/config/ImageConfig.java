package com.hzfc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ImageConfig
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/17 22:15
 */
@Data
@Configuration
public class ImageConfig {
    @Value("${image.prefix}")
    private String imagePrefix;
}
