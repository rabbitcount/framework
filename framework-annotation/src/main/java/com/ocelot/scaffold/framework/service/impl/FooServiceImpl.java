package com.ocelot.scaffold.framework.service.impl;

import com.ocelot.scaffold.framework.entity.User;
import com.ocelot.scaffold.framework.mapper.UserMapper;
import com.ocelot.scaffold.framework.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {

    @Autowired
    private UserMapper userMapper;

    public User doSomeBusinessStuff(long userId) {

        return this.userMapper.getUser(userId);
    }
}
