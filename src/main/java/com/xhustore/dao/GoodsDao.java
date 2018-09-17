package com.xhustore.dao;

import com.xhustore.domain.Goods;

public interface GoodsDao {
    // 插入商品
    int insert(Goods goods);

    // 修改商品
    int update(Goods goods);

    // 删除商品
    int delete(Long id);

    // 根据id查询
    Goods queryById(Long id);

}
