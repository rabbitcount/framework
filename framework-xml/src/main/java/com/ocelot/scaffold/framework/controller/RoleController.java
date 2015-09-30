package com.ocelot.scaffold.framework.controller;

import com.ocelot.scaffold.framework.entity.Role;
import com.ocelot.scaffold.framework.service.FooService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private FooService fooService;

    @RequestMapping(method = RequestMethod.POST)
    public Role create(@RequestParam("name") String name){
        return this.fooService.doCreateRole("testRole");
    }

}
