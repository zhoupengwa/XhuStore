package com.xhustore.vo;

import java.util.List;

import com.xhustore.dto.GoodsDTO;
import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsSearchVO {
    private GoodsExecutionServiceEnum goodsExecutionServiceEnum;
    private List<GoodsDTO> goodsDTOList;

    public GoodsSearchVO(GoodsExecutionServiceEnum goodsExecutionServiceEnum, List<GoodsDTO> goodsDTOList) {
        super();
        this.goodsExecutionServiceEnum = goodsExecutionServiceEnum;
        this.goodsDTOList = goodsDTOList;
    }

    public GoodsExecutionServiceEnum getGoodsExecutionServiceEnum() {
        return goodsExecutionServiceEnum;
    }

    public List<GoodsDTO> getGoodsDTOList() {
        return goodsDTOList;
    }

}
