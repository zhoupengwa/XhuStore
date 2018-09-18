package com.xhustore.vo;

import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsImageUpdateVO {
    private GoodsExecutionServiceEnum goodsServiceEnum;

    public GoodsImageUpdateVO(GoodsExecutionServiceEnum goodsServiceEnum) {
        super();
        this.goodsServiceEnum = goodsServiceEnum;
    }

    public GoodsExecutionServiceEnum getGoodsServiceEnum() {
        return goodsServiceEnum;
    }

}
