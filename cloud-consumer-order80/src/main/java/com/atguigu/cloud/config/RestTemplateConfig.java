package com.atguigu.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: RestTemplateConfig
 * Package: com.atguigu.cloud.config
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/7 11:16
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
