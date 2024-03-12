package com.atguigu.cloud.mygateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * ClassName: MyGlobalFilter
 * Package: com.atguigu.cloud.mygateway
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/9 14:05
 * @Version 1.0
 */
@Component //不要忘记
public class MyGlobalFilter implements GlobalFilter, Ordered
{
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
    {
        return null;
    }

    @Override
    public int getOrder()
    {
        return 0;
    }
}
