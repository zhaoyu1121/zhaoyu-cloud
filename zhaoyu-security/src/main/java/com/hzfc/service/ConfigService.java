package com.hzfc.service;

import com.hzfc.config.Config;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName ConfigService
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/10 22:02
 */
@AllArgsConstructor
@Service
public class ConfigService {

    private final Config config;

    public String getMessage(){
        return config.getMessage();
    }
}
