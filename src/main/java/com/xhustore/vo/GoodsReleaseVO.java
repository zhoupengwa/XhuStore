package com.xhustore.vo;

import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsReleaseVO {
    private GoodsExecutionServiceEnum goodsServiceEnum;
    private Long id;//发布后的商品ID

    public GoodsReleaseVO(GoodsExecutionServiceEnum goodsServiceEnum, Long id) {
        super();
        this.goodsServiceEnum = goodsServiceEnum;
        this.id = id;
    }

    public GoodsExecutionServiceEnum getGoodsServiceEnum() {
        return goodsServiceEnum;
    }

    public void setGoodsServiceEnum(GoodsExecutionServiceEnum goodsServiceEnum) {
        this.goodsServiceEnum = goodsServiceEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
