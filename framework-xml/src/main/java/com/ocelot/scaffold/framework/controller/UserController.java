package com.ocelot.scaffold.framework.controller;

import com.ocelot.scaffold.framework.entity.User;
import com.ocelot.scaffold.framework.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private FooService fooService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User view(@PathVariable("id") int id) {
        return fooService.doSomeBusinessStuff(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestParam("name") String name, @RequestParam("money")BigDecimal money) {
        return this.fooService.doCreateUser(name, money);
    }

}
