package com.learning.mybatis.dao;

import com.learning.mybatis.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User create();
}
