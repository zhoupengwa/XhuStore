package com.xhustore.enums;

public enum GoodsServiceEnum {
    
    RELEASE_SUCCESS(0, "发布成功"),
    RELEASE_FAILED(1, "发布失败")

    
    
    
    
    
    
    
    ;
    private int code;
    private String message;

    GoodsServiceEnum(int code, String message) {
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
