package com.xhustore.vo;

import com.xhustore.enums.UserServiceExecutionEnum;

public class UserUpdatePasswordVO {
    private UserServiceExecutionEnum userServiceExecutionEnum;

    public UserUpdatePasswordVO(UserServiceExecutionEnum userServiceExecutionEnum) {
        this.userServiceExecutionEnum = userServiceExecutionEnum;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }

}
