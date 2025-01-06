package com.hzfc.controller;

import com.hzfc.service.UserService;
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

    private final UserService userService;

    @GetMapping("/message")
    public String getMessage(){
        return userService.getMessage();
    }
}
