package com.learn.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.seckill.mapper.UserMapper;
import com.learn.seckill.pojo.User;
import com.learn.seckill.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
