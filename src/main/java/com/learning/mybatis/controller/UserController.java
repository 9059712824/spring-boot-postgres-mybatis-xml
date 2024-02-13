package com.learning.mybatis.controller;

import com.learning.mybatis.dao.UserDao;
import com.learning.mybatis.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserDao userDao;

    @GetMapping("/get-all")
    public List<User> getAll() {
        return userDao.findAll();
    }
}
