package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * ClassName: OrderServiceImpl
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/12 11:48
 * @Version 1.0
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
