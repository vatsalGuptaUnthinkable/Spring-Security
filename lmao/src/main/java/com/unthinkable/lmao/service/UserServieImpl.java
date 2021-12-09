package com.unthinkable.lmao.service;

import com.unthinkable.lmao.entity.User;
import com.unthinkable.lmao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}
