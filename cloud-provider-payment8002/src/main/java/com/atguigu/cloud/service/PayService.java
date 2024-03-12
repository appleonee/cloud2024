package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * ClassName: PayService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/6 17:25
 * @Version 1.0
 */
public interface PayService
{
    int add(Pay pay);
    int delete(Integer id);
    int update(Pay pay);

    Pay   getById(Integer id);
    List<Pay> getAll();
}