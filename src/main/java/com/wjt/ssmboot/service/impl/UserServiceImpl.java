package com.wjt.ssmboot.service.impl;

import com.wjt.ssmboot.dao.UserMapper;
import com.wjt.ssmboot.domain.User;
import com.wjt.ssmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findUser() {
        return mapper.findUser();
    }
}
