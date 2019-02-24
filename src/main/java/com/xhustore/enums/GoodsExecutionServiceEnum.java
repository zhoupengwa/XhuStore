package com.xhustore.enums;

public enum GoodsExecutionServiceEnum {
    
    RELEASE_SUCCESS(0, "发布成功"),
    RELEASE_FAILED(1, "发布失败"),

    DELETE_SUCCESS(0,"下架成功"),
    DELETE_FAILED(1,"下架失败，请检查商品ID是否存在"),
    
    UPDATE_SUCESS(0,"修改成功"),
    UPDATE_FAILED(1,"修改失败"),
    
    IMAGE_ADD_SUCESS(0,"图片添加成功"),
    IMAGE_ADD_FAILED(1,"图片添加失败"),
    IMAGE_ADD_AMOUNT_ERROR(2,"已超过最大允许数量"),
    IMAGE_DELETE_SUCESS(0,"图片删除成功"),
    IMAGE_DELETE_FAILED(1,"图片删除失败"),
    
    QUERY_SUCCESS(0,"查询成功"),
    QUERY_FAILED(1,"查询失败")
    
    
    
    
    
    ;
    private int code;
    private String message;

    GoodsExecutionServiceEnum(int code, String message) {
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
