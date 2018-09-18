package com.xhustore.vo;

import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsDeleteVO {
    private GoodsExecutionServiceEnum goodsServiceEnum;

    public GoodsDeleteVO(GoodsExecutionServiceEnum goodsServiceEnum) {
        super();
        this.goodsServiceEnum = goodsServiceEnum;
    }

    public GoodsExecutionServiceEnum getGoodsServiceEnum() {
        return goodsServiceEnum;
    }

}
