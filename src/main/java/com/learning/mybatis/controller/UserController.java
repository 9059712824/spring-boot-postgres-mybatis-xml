package com.learning.mybatis.controller;

import com.learning.mybatis.dao.UserDao;
import com.learning.mybatis.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserDao userDao;

    @GetMapping("/get-all")
    public List<User> getAll() {
        return userDao.findAll();
    }

    @PostMapping("/add")
    public int add(@RequestBody User user) {
        user.setUuid(UUID.randomUUID());
        return userDao.create(user);
    }
}
