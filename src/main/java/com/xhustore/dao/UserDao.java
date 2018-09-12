package com.xhustore.dao;

import com.xhustore.domain.User;

public interface UserDao {
    int insertUser(User user);
    int updateUser(User user);
}
