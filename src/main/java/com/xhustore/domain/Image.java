
package com.xhustore.domain;

public class Image {
    private long id;
    
    private long goodsId;
    
    private String image;

    public long getId() {
        return id; 
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
