package com.elensdata.conf;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Project spring-cloud
 * @Date 2020/1/7 10:29
 * @Author: jiangJiaQiang
 */
@Component
public class UriKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {

        return Mono.just(exchange.getRequest().getURI().getPath());
    }
}
