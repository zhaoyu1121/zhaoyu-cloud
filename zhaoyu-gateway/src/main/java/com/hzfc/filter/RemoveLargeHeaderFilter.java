package com.hzfc.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

/**
 * Author: zhaoYu
 * Date: 2025/1/7
 * Description:
 */
@Component
public class RemoveLargeHeaderFilter  extends AbstractGatewayFilterFactory<Object> {

    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            ServerHttpRequest modifiedRequest = exchange.getRequest().mutate()
                    .headers(headers -> {
                        headers.remove("X-Large-Header");
                        headers.remove("Cookie");
                    })
                    .build();
            return chain.filter(exchange.mutate().request(modifiedRequest).build());
        };
    }
}
