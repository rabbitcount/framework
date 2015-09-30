package com.ocelot.scaffold.framework.service.impl;

import com.ocelot.scaffold.framework.entity.Role;
import com.ocelot.scaffold.framework.entity.User;
import com.ocelot.scaffold.framework.entity.status.UserStatus;
import com.ocelot.scaffold.framework.mapper.RoleMapper;
import com.ocelot.scaffold.framework.mapper.UserMapper;
import com.ocelot.scaffold.framework.service.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class FooServiceImpl implements FooService {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    public User doSomeBusinessStuff(int userId) {
        return this.userMapper.getUser(userId);
    }

    public User doCreateUser(String name, BigDecimal money){
        User user = new User();
        user.setName(name);
        user.setStatus(UserStatus.AVAILABLE);
        user.setCreateDate(LocalDate.now());
        user.setMoney(money);
        this.LOGGER.info("create, user's name is {}", name);
        if(1 == this.userMapper.createUser(user))
            return user;
        return null;
    }

    @Override
    public Role doCreateRole(String name) {
        Role role = new Role();
        role.setName(name);
        role.setCrtTime(LocalDateTime.now());
        if(1 == roleMapper.createRole(role))
            return role;
        return null;
    }

}
