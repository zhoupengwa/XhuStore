package com.xhustore.vo;

import com.xhustore.enums.UserServiceExecutionEnum;

public class UserDeleteVO {
    private UserServiceExecutionEnum userServiceExecutionEnum;

    public UserDeleteVO(UserServiceExecutionEnum userServiceExecutionEnum) {
        this.userServiceExecutionEnum = userServiceExecutionEnum;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }
}
