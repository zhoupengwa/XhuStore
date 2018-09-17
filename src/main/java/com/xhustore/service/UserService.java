package com.xhustore.service;

import com.xhustore.domain.User;
import com.xhustore.vo.UserDeleteVO;
import com.xhustore.vo.UserListAllVO;
import com.xhustore.vo.UserLoginVO;
import com.xhustore.vo.UserLookInfoVO;
import com.xhustore.vo.UserRegisterVO;
import com.xhustore.vo.UserUpdateHeadImageVO;
import com.xhustore.vo.UserUpdateInfoVO;
import com.xhustore.vo.UserUpdatePasswordVO;

public interface UserService {
    /**
     * 获取验证码
     */
    void getVerifyCode();

    /**
     * 注册
     */
    UserRegisterVO register(String phone, String password, String verifyCode);

    /**
     * 登录
     */
    UserLoginVO login(String phone, String password);

    /**
     * 修改个人信息
     */
    UserUpdateInfoVO updateInfo(User user);

    /**
     * 设置头像
     */
    UserUpdateHeadImageVO updateHeadImage(Long id, String headImage);

    /**
     * 查看个人信息(是否包含联系方式)
     */
    UserLookInfoVO lookInfo(Long id, boolean includeContactInfo);

    /**
     * 修改密码
     */
    UserUpdatePasswordVO updatePassword(Long id, String originPassword, String newPassword);

    /**
     * 重置密码
     */
    void resetPassword();

    /**
     * 查看所有用户
     */
    UserListAllVO listAllUser();

    /**
     * 分页查看所有用户
     */
    UserListAllVO listAllUserByPage(int pageSize, int currentPage);

    /**
     * 冻结用户
     */
    UserDeleteVO deleteUser(Long id);

}
