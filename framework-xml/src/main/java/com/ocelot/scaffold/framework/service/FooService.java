package com.ocelot.scaffold.framework.service;

import com.ocelot.scaffold.framework.entity.Role;
import com.ocelot.scaffold.framework.entity.User;

import java.math.BigDecimal;

public interface FooService {

    public User doSomeBusinessStuff(int userId);

    public User doCreateUser(String name, BigDecimal money);

    public Role doCreateRole(String name);
}

