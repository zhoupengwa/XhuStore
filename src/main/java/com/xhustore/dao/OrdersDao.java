package com.xhustore.dao;

import com.xhustore.domain.Orders;

public interface OrdersDao {
    // 插入订单
    int insert(Orders orders);
    // 删除订单
    int delete(Long id);
}
