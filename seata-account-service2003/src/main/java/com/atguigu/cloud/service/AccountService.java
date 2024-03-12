package com.atguigu.cloud.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: AccountService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/12 15:36
 * @Version 1.0
 */
public interface AccountService {
   void decrease(Long userId, Long money);
}
