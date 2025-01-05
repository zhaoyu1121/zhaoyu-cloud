package com.hzfc.service;

import com.hzfc.Feign.UserInfoClient;
import com.hzfc.config.Config;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    //private final RestTemplate restTemplate;
    private final UserInfoClient userInfoClient;

    public String getMessage(){
        //return restTemplate.getForObject("http://base/userInfo", String.class);
        return userInfoClient.getUserInfo();
        //return config.getMessage();
    }
}
