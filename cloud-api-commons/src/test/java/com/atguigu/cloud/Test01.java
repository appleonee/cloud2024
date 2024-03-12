package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * ClassName: Test01
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/9 13:15
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

    }
}
