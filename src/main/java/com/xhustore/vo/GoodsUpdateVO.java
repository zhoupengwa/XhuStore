package com.xhustore.vo;

import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsUpdateVO {
    private GoodsExecutionServiceEnum goodsServiceEnum;

    public GoodsUpdateVO(GoodsExecutionServiceEnum goodsServiceEnum) {
        this.goodsServiceEnum = goodsServiceEnum;
    }

    public GoodsExecutionServiceEnum getGoodsServiceEnum() {
        return goodsServiceEnum;
    }
}
