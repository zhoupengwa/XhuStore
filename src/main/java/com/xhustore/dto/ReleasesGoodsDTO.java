package com.xhustore.dto;

import com.xhustore.domain.Goods;

public class ReleasesGoodsDTO {
    private Long releasesId;
    private Goods goods;
    private String firstImage;

    public ReleasesGoodsDTO(Long releasesId, Goods goods, String firstImage) {
        this.releasesId = releasesId;
        this.goods = goods;
        this.firstImage = firstImage;
    }

    public Long getReleasesId() {
        return releasesId;
    }

    public Goods getGoods() {
        return goods;
    }

    public String getFirstImage() {
        return firstImage;
    }

}
