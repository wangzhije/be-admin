package com.wangzhijie.admin.service.impl;

import com.wangzhijie.admin.entity.User;
import com.wangzhijie.admin.mapper.UserMapper;
import com.wangzhijie.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}