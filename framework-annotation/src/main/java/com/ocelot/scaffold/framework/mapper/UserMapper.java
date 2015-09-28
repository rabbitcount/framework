package com.ocelot.scaffold.framework.mapper;

import com.ocelot.scaffold.framework.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id = #{userId}")
    User getUser(@Param("userId") long userId);
}
