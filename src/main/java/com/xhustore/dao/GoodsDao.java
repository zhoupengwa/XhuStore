package com.xhustore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.Goods;
import com.xhustore.dto.GoodsDTO;
import com.xhustore.dto.GoodsDetailDTO;

public interface GoodsDao {
    // 插入商品
    int insert(Goods goods);

    // 修改商品
    int update(Goods goods);

    // 删除商品
    int delete(Long id);

    // 根据id查询
    GoodsDetailDTO queryById(Long id);

    // 查询所有
    List<GoodsDTO> listGoods(@Param("name") String name, @Param("type") String type, @Param("minPrice") Float minPrice,
            @Param("maxPrice") Float maxPrice, @Param("orderByPriceDesc") Boolean orderByPriceDesc);

    // 带分页
    List<GoodsDTO> listGoodsByPage(@Param("name") String name, @Param("type") String type,
            @Param("minPrice") Float minPrice, @Param("maxPrice") Float maxPrice,
            @Param("orderByPriceDesc") Boolean orderByPriceDesc, @Param("pageSize") int pageSize,
            @Param("startIndex") long startIndex);

    // 统计总数
    Long count(@Param("name") String name,@Param("type")String type, @Param("minPrice") Float minPrice, @Param("maxPrice") Float maxPrice);

}
