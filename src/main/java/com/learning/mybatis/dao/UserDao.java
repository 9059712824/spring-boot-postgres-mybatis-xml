package com.learning.mybatis.dao;

import com.learning.mybatis.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    int create(@Param("user") User user);
}
