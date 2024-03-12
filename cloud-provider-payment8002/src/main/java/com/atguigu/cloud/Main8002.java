package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: Main8002
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/8 10:07
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@EnableDiscoveryClient
public class Main8002
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main8002.class,args);
    }
}
