package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: Main83
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/9 14:54
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class Main83
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main83.class,args);
    }
}
