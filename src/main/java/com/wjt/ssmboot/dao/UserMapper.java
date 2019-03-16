package com.wjt.ssmboot.dao;

import com.wjt.ssmboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findUser();
}
