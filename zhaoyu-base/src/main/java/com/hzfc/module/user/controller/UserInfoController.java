package com.hzfc.module.user.controller;

import com.hzfc.module.user.service.UserInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 * Author: zhaoYu
 * Date: 2025/1/5
 * Description:
 */
@RestController
@AllArgsConstructor
@RequestMapping("/userInfo")
public class UserInfoController {
    private final UserInfoService userInfoService;

    @GetMapping("")
    public String getUserInfo() {
        return userInfoService.getUserInfo();
    }
}
