package com.xhustore.vo;

import com.xhustore.domain.PageBean;
import com.xhustore.enums.GoodsExecutionServiceEnum;

public class GoodsSearchByPageVO<T> {
    private GoodsExecutionServiceEnum goodsExecutionServiceEnum;
    private PageBean<T> pageBean;

    public GoodsSearchByPageVO(GoodsExecutionServiceEnum goodsExecutionServiceEnum, PageBean<T> pageBean) {
        super();
        this.goodsExecutionServiceEnum = goodsExecutionServiceEnum;
        this.pageBean = pageBean;
    }

    public GoodsExecutionServiceEnum getGoodsExecutionServiceEnum() {
        return goodsExecutionServiceEnum;
    }

    public PageBean<T> getPageBean() {
        return pageBean;
    }

}
