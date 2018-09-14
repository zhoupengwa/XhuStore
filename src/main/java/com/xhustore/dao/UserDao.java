package com.xhustore.dao;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.User;

public interface UserDao {
    // 插入用户
    int insert(User user);

    // 修改用户
    int update(User user);

    // 删除用户
    int delete(Long id);

    // 修改头像字段
    int updateHeadImage(@Param(value = "id") Long id, @Param("headImage") String headImage);

    // 修改密码字段
    int updatePassword(@Param("id") Long id, @Param("password") String password);
}
