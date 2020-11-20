package com.shard.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shard.demo.entity.User;
import com.shard.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}