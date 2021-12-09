package com.unthinkable.lmao.service;

import com.unthinkable.lmao.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User save(User user);

    User getByUserName(String userName);
}
