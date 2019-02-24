package com.xhustore.vo;

import java.util.List;

import com.xhustore.dto.ReleasesGoodsDTO;
import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsListReleaseVO {
    private GoodsExecutionServiceEnum goodsExecutionServiceEnum;
    private List<ReleasesGoodsDTO> releasesGoodsDTOList;

    public GoodsListReleaseVO(GoodsExecutionServiceEnum goodsExecutionServiceEnum,
            List<ReleasesGoodsDTO> releasesGoodsDTOList) {
        this.goodsExecutionServiceEnum = goodsExecutionServiceEnum;
        this.releasesGoodsDTOList = releasesGoodsDTOList;
    }

    public GoodsExecutionServiceEnum getGoodsExecutionServiceEnum() {
        return goodsExecutionServiceEnum;
    }

    public List<ReleasesGoodsDTO> getReleasesGoodsDTOList() {
        return releasesGoodsDTOList;
    }

}
