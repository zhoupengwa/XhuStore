package com.xhustore.enums;

public enum UserServiceExecutionEnum {
    LOGIN_SUCCESS(0, "登录成功"),
    LOGIN_ACCOUNT_ERROR(1, "账号或密码错误"),

    UPDATE_SUCCESS(0, "修改成功"), 
    UPDATE_FAILED(1, "修改失败，请检查用户ID是否正确"),
    UPDATE_PASSWORD_FAILED(2,"原密码输入错误"), 
    
    LOOK_SUCCESS(0, "查询成功"), LOOK_FAILED(1, "查询失败"),

    DELETE_SUCCESS(0, "删除/冻结成功"), DELETE_FAILED(1, "删除/冻结失败，请检查用户ID是否正确")

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
