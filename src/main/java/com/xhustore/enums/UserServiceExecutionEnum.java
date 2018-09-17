package com.xhustore.enums;

public enum UserServiceExecutionEnum {
    LOGIN_SUCCESS(0, "登录成功"),
    LOGIN_ACCOUNT_ERROR(1, "账号或密码错误"),

    UPDATE_SUCCESS(0, "修改成功"), 
    UPDATE_FAILED(1, "修改失败,未知原因"),

    LOOK_SUCCESS(0, "查询成功"),
    LOOK_FAILED(1, "查询失败")

    ;
    private int code;
    private String message;

    UserServiceExecutionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
