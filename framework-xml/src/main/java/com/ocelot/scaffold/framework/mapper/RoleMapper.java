package com.ocelot.scaffold.framework.mapper;


import com.ocelot.scaffold.framework.entity.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

    int createRole(@Param("newRole")Role newRole);
}
