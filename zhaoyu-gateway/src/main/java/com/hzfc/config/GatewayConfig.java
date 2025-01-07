package com.hzfc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.server.HttpServer;

/**
 * 
 * Author: zhaoYu
 * Date: 2025/1/7
 * Description: 
 */
@Slf4j
@Configuration
public class GatewayConfig {
    @Bean
    public HttpServer customHttpServer() {
        log.info("Custom HttpServer configuration is being applied.");
        return HttpServer.create()
                .httpRequestDecoder(spec -> {
                    log.info("Setting maxHeaderSize to 16 KB.");
                    spec.maxHeaderSize(64 * 1024);
                    return spec;
                });
    }
}
