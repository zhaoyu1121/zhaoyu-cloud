package com.hzfc.controller;

import com.hzfc.service.ConfigService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/10 22:48
 */
@AllArgsConstructor
@RestController
public class ConfigController {

    private final ConfigService service;

    @GetMapping("/message")
    public String getMessage(){
        return service.getMessage();
    }
}
