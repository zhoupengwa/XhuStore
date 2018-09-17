package com.xhustore.service;

public interface OrdersService {
    /**
     * 列出购买订单
     */
    void listPurchaseOrders();

    /**
     * 分页列出购买订单
     */
    void listPurchaseOrdersByPage();

    /**
     * 列出出售订单
     */
    void listSellOrders();

    /**
     * 分页列出出售订单
     */
    void listSellOrdersByPage();

    /**
     * 查看出售详情（商品+卖家部分信息）
     */
    void lookSellDetail();

    /**
     * 删除订单
     */
    void deleteOrders();

    /**
     * 对订单进行评价
     */
    void commentOrders();

    /**
     * 对订单进行点赞
     */
    void admireOrders();

}
