package com.hzfc.module.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户管理
 * Author: zhaoYu
 * Date: 2025/1/5
 * Description:
 */
@Service
@Slf4j
public class UserInfoService {
    public String getUserInfo() {
        log.info("输出");
        return "获取用户信息";
    }
}
