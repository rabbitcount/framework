package com.ocelot.scaffold.framework.mapper;

import com.ocelot.scaffold.framework.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUser(@Param("userId") long userId);

    int createUser(@Param("newUser")User newUser);
}
