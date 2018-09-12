package com.xhustore.domain;

import java.util.Date;

public class Orders {
    private Long id;
    private Long goodsId;
    private Long buyerId;
    private Long sellerId;
    private Integer state;
    private Date starTime;
    private Date finishTime;
    private String comment;
    private Boolean admire;

    public Orders(Long id, Long goodsId, Long buyerId, Long sellerId, Integer state, Date starTime, Date finishTime,
            String comment, Boolean admire) {
        super();
        this.id = id;
        this.goodsId = goodsId;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.state = state;
        this.starTime = starTime;
        this.finishTime = finishTime;
        this.comment = comment;
        this.admire = admire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean isAdmire() {
        return admire;
    }

    public void setAdmire(Boolean admire) {
        this.admire = admire;
    }

}
