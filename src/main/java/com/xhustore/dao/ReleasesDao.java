package com.xhustore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhustore.domain.Releases;
import com.xhustore.dto.ReleasesGoodsDTO;
import com.xhustore.dto.UserDTO;

public interface ReleasesDao {
    // 插入发布信息
    int insert(Releases releases);

    // 删除发布信息
    int delete(Long id);

    // 根据用户ID与物品ID检查发布是否存在
    Long queryReleasesId(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

    // 查询
    List<ReleasesGoodsDTO> listReleasesGoods(Long userId);

    // 根据商品ID查询发布者（卖家）信息
    UserDTO queryUserByGoodsId(Long goodsId);
}
