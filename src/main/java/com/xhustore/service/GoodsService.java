package com.xhustore.service;

import java.util.List;

import com.xhustore.domain.Goods;
import com.xhustore.domain.Image;
import com.xhustore.vo.GoodsDeleteVO;
import com.xhustore.vo.GoodsImageUpdateVO;
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
    GoodsReleaseVO releaseGoods(Long userId,Goods goods, List<Image> imageList);

    /**
     * 下架商品
     */
    GoodsDeleteVO deleteGoods(Long userId,Long goodsId);

    /**
     * 更改已上架商品信息
     */
    GoodsUpdateVO updateGoods(Long userId,Goods goods);

    /**
     * 
     * 为商品添加图片
     */
    GoodsImageUpdateVO addImage(Long userId,Long goodsId, String imagePath);

    /**
     * 为商品删除图片
     * 
     */
    GoodsImageUpdateVO deleteImage(Long userId,Long goodsId, Long imageId);

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
    void listAllGoodsByPage(int pageSize, int currentPage);

}
