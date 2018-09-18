package com.xhustore.dao;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.Releases;

public interface ReleasesDao {
    // 插入发布信息
    int insert(Releases releases);

    // 删除发布信息
    int delete(Long id);

    // 根据用户ID与物品ID检查发布是否存在
    Long queryReleasesId(@Param("userId") Long userId, @Param("goodsId") Long goodsId);
}