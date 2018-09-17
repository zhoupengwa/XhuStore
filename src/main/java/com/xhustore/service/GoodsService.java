package com.xhustore.service;

import com.xhustore.domain.Goods;
import com.xhustore.vo.GoodsDeleteVO;
import com.xhustore.vo.GoodsListAllVO;
import com.xhustore.vo.GoodsListReleaseVO;
import com.xhustore.vo.GoodsLookInfoVO;
import com.xhustore.vo.GoodsPurchaseVO;
import com.xhustore.vo.GoodsReleaseVO;
import com.xhustore.vo.GoodsSearchVO;
import com.xhustore.vo.GoodsUpdateVO;

public interface GoodsService {
    /**
     * 发布商品
     */
    GoodsReleaseVO releaseGoods(Goods goods);

    /**
     * 下架商品（冻结商品）
     */
    GoodsDeleteVO deleteGoods();

    /**
     * 更改已上架商品信息
     */
    GoodsUpdateVO updateGoods();

    /**
     * 列出已上架商品
     */
    GoodsListReleaseVO listReleaseGoods();

    /**
     * 查看商品详细信息
     */
    GoodsLookInfoVO lookGoodsInfo();

    /**
     * 搜索商品-名称、价格、类别、发布时间【五个条件可随意组合】
     */
    GoodsSearchVO searchGoods();

    /**
     * 分页搜索商品-名称、价格、类别、发布时间【五个条件可随意组合】
     */
    void serachGoodsByPage(int pageSize, int currentPage);

    /**
     * 购买商品
     */
    GoodsPurchaseVO purchaseGoods();

    /**
     * 查看所有商品
     */
    GoodsListAllVO listAllGoods();

    /**
     * 分页查看所有商品
     */
    void listAllGoodsByPage(int pageSize,int currentPage);

}
