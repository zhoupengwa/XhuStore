package com.xhustore.service;

public interface UserService {
    /**
     * 获取验证码
     */
    void getVerifyCode();

    /**
     * 注册
     */
    void register(String phone, String password, String verifyCode);

    /**
     * 登录
     */
    boolean login(String phone, String password);

    /**
     * 修改个人信息
     */
    void updateInfo();

    /**
     * 设置头像
     */
    void updateHeadImage();

    /**
     * 查看个人信息
     */
    void lookInfo();

    /**
     * 修改密码
     */
    void updatePassword();

    /**
     * 重置密码
     */
    void resetPassword();

    /**
     * 查看所有用户
     */
    void listAllUser();

    /**
     * 冻结用户
     */
    void deleteUser();

}
