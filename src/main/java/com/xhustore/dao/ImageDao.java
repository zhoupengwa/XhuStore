package com.xhustore.dao;

import com.xhustore.domain.Image;

public interface ImageDao {
    // 插入图片
    int insert(Image image);

    // 删除图片
    int delete(Long id);
}
