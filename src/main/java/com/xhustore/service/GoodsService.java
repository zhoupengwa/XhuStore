package com.xhustore.service;

public interface GoodsService {
    /**
     * 发布商品
     */
    void releaseGoods();

    /**
     * 下架商品（冻结商品）
     */
    void deleteGoods();

    /**
     * 更改已上架商品信息
     */
    void updateGoods();

    /**
     * 列出已上架商品
     */
    void listReleaseGoods();

    /**
     * 查看商品详细信息
     */
    void lookGoodsInfo();

    /**
     * 搜索商品-名称、价格、类别、发布时间【五个条件可随意组合】
     */
    void searchGoods();

    /**
     * 分页搜索商品-名称、价格、类别、发布时间【五个条件可随意组合】
     */
    void serachGoodsByPage(int pageSize, int currentPage);

    /**
     * 购买商品
     */
    void purchaseGoods();

    /**
     * 查看所有商品
     */
    void listAllGoods();

    /**
     * 分页查看所有商品
     */
    void listAllGoodsByPage(int pageSize,int currentPage);

}
