package com.jiacool.mapper;

import com.jiacool.domain.User;

import java.util.List;

//用户
public interface UserMapper {

    //查询所有 一对多
    List<User> findAll();

    List<User> findUserAndRole();
}
