package com.xhustore.vo;

import com.xhustore.enums.UserServiceExecutionEnum;

public class UserUpdateHeadImageVO {
    private UserServiceExecutionEnum userServiceExecutionEnum;

    public UserUpdateHeadImageVO(UserServiceExecutionEnum userServiceExecutionEnum) {
        this.userServiceExecutionEnum = userServiceExecutionEnum;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }
}
