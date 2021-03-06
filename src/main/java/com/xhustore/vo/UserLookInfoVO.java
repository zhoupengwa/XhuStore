package com.xhustore.vo;

import com.xhustore.dto.UserDTO;
import com.xhustore.enums.UserServiceExecutionEnum;

public class UserLookInfoVO {
    private UserServiceExecutionEnum userServiceExecutionEnum;
    private UserDTO userDTO;// 查看个人信息得到的个人信息

    public UserLookInfoVO(UserServiceExecutionEnum userServiceExecutionEnum, UserDTO userDTO) {
        this.userServiceExecutionEnum = userServiceExecutionEnum;
        this.userDTO = userDTO;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

}
