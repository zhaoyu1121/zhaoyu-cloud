package com.hzfc.service;

import com.hzfc.Feign.UserInfoClient;
import com.hzfc.config.Config;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.springframework.stereotype.Service;

/**
 * Author: zhaoYu
 * Date: 2025/1/6
 * Description:
 */
@Slf4j
@Service
@AllArgsConstructor
public class UserService {
    private final Config config;
    //private final RestTemplate restTemplate;
    private final UserInfoClient userInfoClient;

    @Bulkhead(name = "backendA", fallbackMethod = "fallback")
    //@RateLimiter(name = "backendA", fallbackMethod = "fallback")
    //@Retry(name = "backendA", fallbackMethod = "fallback")
    //@CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
    public String getMessage(){
        log.info("getMessage");
        return "aaa";
        //throw new RuntimeException("Inventory check failed for product ");
        //return restTemplate.getForObject("http://base/userInfo", String.class);
        //return userInfoClient.getUserInfo();
        //return config.getMessage();
    }

    public String fallback(Throwable e){
        log.info("服务不可达");
        return "服务不可达！";
    }
}
