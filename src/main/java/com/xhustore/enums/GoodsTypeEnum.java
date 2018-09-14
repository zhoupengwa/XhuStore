package com.xhustore.enums;

public enum GoodsTypeEnum {
    CLOSES("服装");
    public String name;

    GoodsTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
