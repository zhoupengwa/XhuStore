package com.xhustore.vo;

import com.xhustore.dto.GoodsDetailDTO;
import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsLookInfoVO {
    private GoodsExecutionServiceEnum goodsExecutionServiceEnum;
    private GoodsDetailDTO goodsDTO;

    public GoodsLookInfoVO(GoodsExecutionServiceEnum goodsExecutionServiceEnum, GoodsDetailDTO goodsDTO) {
        super();
        this.goodsExecutionServiceEnum = goodsExecutionServiceEnum;
        this.goodsDTO = goodsDTO;
    }

    public GoodsExecutionServiceEnum getGoodsExecutionServiceEnum() {
        return goodsExecutionServiceEnum;
    }

    public GoodsDetailDTO getGoodsDTO() {
        return goodsDTO;
    }
}
