package com.xhustore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhustore.consts.CommonPropertiesConsts;
import com.xhustore.dao.GoodsDao;
import com.xhustore.dao.ImageDao;
import com.xhustore.dao.OrdersDao;
import com.xhustore.dao.ReleasesDao;
import com.xhustore.domain.Goods;
import com.xhustore.domain.Image;
import com.xhustore.domain.PageBean;
import com.xhustore.domain.Releases;
import com.xhustore.dto.GoodsDTO;
import com.xhustore.dto.GoodsDetailDTO;
import com.xhustore.dto.ReleasesGoodsDTO;
import com.xhustore.dto.UserDTO;
import com.xhustore.enums.GoodsExecutionServiceEnum;
import com.xhustore.service.GoodsService;
import com.xhustore.util.PropertiesUtil;
import com.xhustore.vo.GoodsDeleteVO;
import com.xhustore.vo.GoodsImageUpdateVO;
import com.xhustore.vo.GoodsListAllVO;
import com.xhustore.vo.GoodsListReleaseVO;
import com.xhustore.vo.GoodsLookInfoVO;
import com.xhustore.vo.GoodsPurchaseVO;
import com.xhustore.vo.GoodsReleaseVO;
import com.xhustore.vo.GoodsSearchByPageVO;
import com.xhustore.vo.GoodsSearchVO;
import com.xhustore.vo.GoodsUpdateVO;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private ImageDao imageDao;
    @Autowired
    private ReleasesDao releasesDao;
    @Autowired
    private OrdersDao ordersDao;

    @Transactional
    @Override
    public GoodsReleaseVO releaseGoods(Long userId, Goods goods, List<Image> imageList) {
        int count = goodsDao.insert(goods);
        if (count == 1) {
            Long goodsId = goods.getId();
            // 存入图片
            for (Image image : imageList) {
                image.setGoodsId(goodsId);
                imageDao.insert(image);
            }
            // 存入发布单据
            if (releasesDao.insert(new Releases(userId, goodsId)) == 1) {
                return new GoodsReleaseVO(GoodsExecutionServiceEnum.RELEASE_SUCCESS, goods.getId());
            }
            return new GoodsReleaseVO(GoodsExecutionServiceEnum.RELEASE_FAILED, null);
        }
        return new GoodsReleaseVO(GoodsExecutionServiceEnum.RELEASE_FAILED, null);
    }

    @Transactional
    @Override
    public GoodsDeleteVO deleteGoods(Long userId, Long goodsId) {
        Long releasesId = releasesDao.queryReleasesId(userId, goodsId);
        if (releasesId == null) {// 检查权限
            return new GoodsDeleteVO(GoodsExecutionServiceEnum.DELETE_FAILED);
        }
        // 检查商品状态，即是否已经产生单据
        Integer state = ordersDao.queryState(goodsId);
        if (state == null) {
            int count = goodsDao.delete(goodsId);
            if (count == 1) {
                if (releasesDao.delete(releasesId) == 1) {
                    return new GoodsDeleteVO(GoodsExecutionServiceEnum.DELETE_SUCCESS);
                }
                return new GoodsDeleteVO(GoodsExecutionServiceEnum.DELETE_FAILED);
            }
            return new GoodsDeleteVO(GoodsExecutionServiceEnum.DELETE_FAILED);
        }
        return new GoodsDeleteVO(GoodsExecutionServiceEnum.DELETE_FAILED);
    }

    @Override
    public GoodsUpdateVO updateGoods(Long userId, Goods goods) {
        Long releasesId = releasesDao.queryReleasesId(userId, goods.getId());
        if (releasesId == null) {// 检查权限
            return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_FAILED);
        }
        // 检查商品状态
        // TODO
        int count = goodsDao.update(goods);
        if (count == 1) {
            return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_SUCESS);
        }
        return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_FAILED);
    }

    @Override
    public GoodsImageUpdateVO addImage(Long userId, Long goodsId, String imagePath) {
        Long releasesId = releasesDao.queryReleasesId(userId, goodsId);
        if (releasesId == null) { // 检查权限
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_ADD_FAILED);
        }
        // 检查商品状态
        // TODO
        Long existAmount = imageDao.count(goodsId);
        int maxCount = Integer.parseInt(PropertiesUtil.getValue(CommonPropertiesConsts.GOODS_IMAGE_MAX_AMOUNT));
        if (existAmount >= maxCount) {
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_ADD_AMOUNT_ERROR);
        }
        Image image = new Image(goodsId, imagePath);
        int count = imageDao.insert(image);
        if (count == 1) {
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_ADD_SUCESS);
        }
        return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_ADD_FAILED);
    }

    @Override
    public GoodsImageUpdateVO deleteImage(Long userId, Long goodsId, Long imageId) {
        Long releasesId = releasesDao.queryReleasesId(userId, goodsId);
        if (releasesId == null) { // 检查权限
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_FAILED);
        }
        // 检查商品状态
        // TODO
        int count = imageDao.delete(imageId, goodsId);
        if (count == 1) {
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_SUCESS);
        }
        return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_FAILED);
    }

    @Override
    public GoodsListReleaseVO listReleaseGoods(Long userId) {
        List<ReleasesGoodsDTO> newReleasesGoodsDTOList = new ArrayList<>();
        // 一次双表联查
        List<ReleasesGoodsDTO> releasesGoodsDTOList = releasesDao.listReleasesGoods(userId);
        // 二次查询，关联图片
        for (ReleasesGoodsDTO releasesGoodsDTO : releasesGoodsDTOList) {
            Long goodsId = releasesGoodsDTO.getGoods().getId();
            String firstImage = imageDao.queryFirstImage(goodsId);
            releasesGoodsDTO.setFirstImage(firstImage);
            newReleasesGoodsDTOList.add(releasesGoodsDTO);
        }
        return new GoodsListReleaseVO(GoodsExecutionServiceEnum.QUERY_SUCCESS, newReleasesGoodsDTOList);
    }

    @Override
    public GoodsLookInfoVO lookGoodsInfo(Long goodsId) {
        GoodsDetailDTO goodsDetailDTO = goodsDao.queryById(goodsId);
        if (goodsDetailDTO != null) {
            UserDTO sellerDTO = releasesDao.queryUserByGoodsId(goodsId);
            goodsDetailDTO.setUserDTO(sellerDTO);
            return new GoodsLookInfoVO(GoodsExecutionServiceEnum.QUERY_SUCCESS, goodsDetailDTO);
        }
        return new GoodsLookInfoVO(GoodsExecutionServiceEnum.QUERY_FAILED, null);
    }

    @Override
    public GoodsSearchVO searchGoods(String name, String type, Float minPrice, Float maxPrice,
            Boolean orderByPriceDesc) {
        List<GoodsDTO> goodsDTOList = goodsDao.listGoods(name, type, minPrice, maxPrice, orderByPriceDesc);
        return new GoodsSearchVO(GoodsExecutionServiceEnum.QUERY_SUCCESS, goodsDTOList);
    }

    @SuppressWarnings("unchecked")
    @Override
    public GoodsSearchByPageVO<List<GoodsDTO>> serachGoodsByPage(String name, String type, Float minPrice,
            Float maxPrice, Boolean orderByPriceDesc, int pageSize, int currentPage) {
        Long totalRows = goodsDao.count(name, type, minPrice, maxPrice);
        PageBean<List<GoodsDTO>> pageBean = new PageBean<>(pageSize, currentPage, totalRows);
        long startIndex = pageBean.getStartIndex();
        List<GoodsDTO> goodsDTOList = goodsDao.listGoodsByPage(name, type, minPrice, maxPrice, orderByPriceDesc,
                pageSize, startIndex);
        pageBean.setData(goodsDTOList);
        return new GoodsSearchByPageVO<>(GoodsExecutionServiceEnum.QUERY_SUCCESS, pageBean);
    }

    @Override
    public GoodsPurchaseVO purchaseGoods() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GoodsListAllVO listAllGoods() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void listAllGoodsByPage(int pageSize, int currentPage) {
        // TODO Auto-generated method stub

    }

}
