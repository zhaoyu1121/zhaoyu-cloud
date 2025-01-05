package com.hzfc.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: zhaoYu
 * Date: 2025/1/5
 * Description:
 */
@FeignClient(name = "base")
public interface UserInfoClient {
    @GetMapping("/userInfo")
    String getUserInfo();
}
