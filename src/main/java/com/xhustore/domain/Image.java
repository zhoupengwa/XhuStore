
package com.xhustore.domain;

public class Image {
    private Long id;

    private Long goodsId;

    private String image;

    public Image() {
    }

    public Image(Long goodsId, String image) {
        this.goodsId = goodsId;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
