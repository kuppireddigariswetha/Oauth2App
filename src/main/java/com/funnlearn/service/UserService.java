package com.funnlearn.service;

import java.util.List;

import com.funnlearn.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
