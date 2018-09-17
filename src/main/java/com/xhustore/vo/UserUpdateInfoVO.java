package com.xhustore.vo;

import com.xhustore.enums.UserServiceExecutionEnum;

public class UserUpdateInfoVO {
    private UserServiceExecutionEnum userServiceExecutionEnum;

    public UserUpdateInfoVO(UserServiceExecutionEnum userServiceExecutionEnum) {
        this.userServiceExecutionEnum = userServiceExecutionEnum;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }

}
