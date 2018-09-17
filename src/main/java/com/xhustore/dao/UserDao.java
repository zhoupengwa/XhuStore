package com.xhustore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.User;
import com.xhustore.dto.UserDTO;

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

    // 查询密码字段
    String queryPasswordById(@Param("id") Long id);

    // 根据账号和密码查询用户
    UserDTO queryByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);

    // 根据ID查询用户
    UserDTO queryById(@Param("id") Long id, @Param("includeContactInfo") boolean includeContactInfo);

    // 查询所有用户
    List<UserDTO> queryAll();
}
