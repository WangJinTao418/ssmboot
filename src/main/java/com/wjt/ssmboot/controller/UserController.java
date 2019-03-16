package com.wjt.ssmboot.controller;

import com.wjt.ssmboot.domain.User;
import com.wjt.ssmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "user")
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "findUser")
    public List<User> findUser(){
        List<User> list = service.findUser();
        return list;
    }

}
