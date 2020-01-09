package com.example.provider.service;/**
 * @description:
 * @author: Lenovo
 * @date: 2020-01-09 10:23
 */

import com.alibaba.dubbo.config.annotation.Service;
import model.User;
import org.springframework.stereotype.Component;
import service.UserService;

/**
 * @Auther chenhao
 * @Date 2020/1/9
 */

@Component
@Service(version = "1.0.0",timeout = 1000)
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user=new User();
        user.setAge(11);
        user.setName("121");
        return user;
    }
}
