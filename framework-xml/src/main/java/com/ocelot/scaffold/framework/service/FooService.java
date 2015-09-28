package com.ocelot.scaffold.framework.service;

import com.ocelot.scaffold.framework.entity.User;

public interface FooService {

    public User doSomeBusinessStuff(int userId);

    public User doCreateUser(String name);
}

