package com.xhustore.dao;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.Image;

public interface ImageDao {
    // 插入图片
    int insert(Image image);

    // 删除图片
    int delete(@Param("id") Long id, @Param("goodsId") Long goodsId);

    // 统计图片数量
    Long count(Long goodsId);
}
