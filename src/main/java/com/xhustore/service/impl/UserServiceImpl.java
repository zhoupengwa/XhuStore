package com.xhustore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhustore.dao.UserDao;
import com.xhustore.domain.User;
import com.xhustore.dto.UserDTO;
import com.xhustore.enums.UserServiceExecutionEnum;
import com.xhustore.service.UserService;
import com.xhustore.vo.UserDeleteVO;
import com.xhustore.vo.UserListAllVO;
import com.xhustore.vo.UserLoginVO;
import com.xhustore.vo.UserLookInfoVO;
import com.xhustore.vo.UserRegisterVO;
import com.xhustore.vo.UserUpdateHeadImageVO;
import com.xhustore.vo.UserUpdateInfoVO;
import com.xhustore.vo.UserUpdatePasswordVO;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void getVerifyCode() {
        // TODO Auto-generated method stub

    }

    @Override
    public UserRegisterVO register(String phone, String password, String verifyCode) {
        return null;
        // TODO Auto-generated method stub

    }

    @Override
    public UserLoginVO login(String phone, String password) {
        UserDTO userDTO = userDao.queryByPhoneAndPassword(phone, password);
        if (userDTO != null) {
            return new UserLoginVO(UserServiceExecutionEnum.LOGIN_SUCCESS, userDTO);
        }
        return new UserLoginVO(UserServiceExecutionEnum.LOGIN_ACCOUNT_ERROR, null);
    }

    @Override
    public UserUpdateInfoVO updateInfo(User user) {
        int count = userDao.update(user);
        if (count == 1) {
            return new UserUpdateInfoVO(UserServiceExecutionEnum.UPDATE_SUCCESS);
        }
        return new UserUpdateInfoVO(UserServiceExecutionEnum.UPDATE_FAILED);
    }

    @Override
    public UserUpdateHeadImageVO updateHeadImage(Long id, String headImage) {
        int count = userDao.updateHeadImage(id, headImage);
        if (count == 1) {
            return new UserUpdateHeadImageVO(UserServiceExecutionEnum.UPDATE_SUCCESS);
        }
        return new UserUpdateHeadImageVO(UserServiceExecutionEnum.UPDATE_FAILED);
    }

    @Override
    public UserLookInfoVO lookInfo(Long id, boolean includeContactInfo) {
        UserDTO userDTO = userDao.queryById(id, includeContactInfo);
        return new UserLookInfoVO(UserServiceExecutionEnum.LOOK_SUCCESS, userDTO);
    }

    @Override
    public UserUpdatePasswordVO updatePassword(Long id, String originPassword, String newPassword) {
        String password = userDao.queryPasswordById(id);
        if (password != null) {
            if (originPassword.equals(password)) {
                int count = userDao.updatePassword(id, newPassword);
                if (count == 1) {
                    return new UserUpdatePasswordVO(UserServiceExecutionEnum.UPDATE_SUCCESS);
                }
            } else {
                return new UserUpdatePasswordVO(UserServiceExecutionEnum.UPDATE_PASSWORD_FAILED);
            }
        }
        return new UserUpdatePasswordVO(UserServiceExecutionEnum.UPDATE_FAILED);
    }

    @Override
    public void resetPassword() {
        // TODO Auto-generated method stub

    }

    @Override
    public UserListAllVO listAllUser() {
        List<UserDTO> userDTOList = userDao.queryAll();
        UserListAllVO userListAllVO = new UserListAllVO(UserServiceExecutionEnum.LOOK_SUCCESS, userDTOList);
        return userListAllVO;
    }

    @Override
    public UserListAllVO listAllUserByPage(int pageSize, int currentPage) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDeleteVO deleteUser(Long id) {
        int count = userDao.delete(id);
        if (count == 1) {
            return new UserDeleteVO(UserServiceExecutionEnum.DELETE_SUCCESS);
        }
        return new UserDeleteVO(UserServiceExecutionEnum.DELETE_FAILED);
    }

}
