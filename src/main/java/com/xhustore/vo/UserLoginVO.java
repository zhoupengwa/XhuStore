package com.xhustore.vo;

import com.xhustore.dto.UserDTO;
import com.xhustore.enums.UserServiceExecutionEnum;

public class UserLoginVO {
    private UserServiceExecutionEnum loginExecutionEnum;
    private UserDTO userDTO;

    public UserLoginVO(UserServiceExecutionEnum loginExecutionEnum, UserDTO userDTO) {
        super();
        this.loginExecutionEnum = loginExecutionEnum;
        this.userDTO = userDTO;
    }

    public UserServiceExecutionEnum getLoginExecutionEnum() {
        return loginExecutionEnum;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

}
