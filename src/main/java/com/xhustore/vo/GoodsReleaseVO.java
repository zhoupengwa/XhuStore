package com.xhustore.vo;

import com.xhustore.enums.GoodsServiceEnum;

public class GoodsReleaseVO {
    private GoodsServiceEnum goodsServiceEnum;
    private Long id;//发布后的商品ID

    public GoodsReleaseVO(GoodsServiceEnum goodsServiceEnum, Long id) {
        super();
        this.goodsServiceEnum = goodsServiceEnum;
        this.id = id;
    }

    public GoodsServiceEnum getGoodsServiceEnum() {
        return goodsServiceEnum;
    }

    public void setGoodsServiceEnum(GoodsServiceEnum goodsServiceEnum) {
        this.goodsServiceEnum = goodsServiceEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
