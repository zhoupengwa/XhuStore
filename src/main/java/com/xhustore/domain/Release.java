package com.xhustore.domain;

public class Release {
    private Long id;
    private Long userId;
    private Long goodsId;

    public Release(Long id, Long userId, Long goodsId) {
        super();
        this.id = id;
        this.userId = userId;
        this.goodsId = goodsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

}
