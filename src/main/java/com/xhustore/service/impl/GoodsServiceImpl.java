package com.xhustore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhustore.consts.CommonPropertiesConsts;
import com.xhustore.dao.GoodsDao;
import com.xhustore.dao.ImageDao;
import com.xhustore.dao.ReleasesDao;
import com.xhustore.domain.Goods;
import com.xhustore.domain.Image;
import com.xhustore.domain.Releases;
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
        if (releasesId != null) { // 检查权限
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
        if (releasesId != null) { // 检查权限
            int count = goodsDao.update(goods);
            if (count == 1) {
                return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_SUCESS);
            }
            return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_FAILED);
        }
        return new GoodsUpdateVO(GoodsExecutionServiceEnum.UPDATE_FAILED);
    }

    @Override
    public GoodsImageUpdateVO addImage(Long userId, Long goodsId, String imagePath) {
        Long releasesId = releasesDao.queryReleasesId(userId, goodsId);
        if (releasesId == null) { // 检查权限
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_ADD_FAILED);
        }
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
    public GoodsImageUpdateVO deleteImage(Long userId,Long goodsId, Long imageId) {
        Long releasesId = releasesDao.queryReleasesId(userId, goodsId);
        if (releasesId == null) { // 检查权限
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_FAILED);
        }
        int count = imageDao.delete(imageId, goodsId);
        if (count == 1) {
            return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_SUCESS);
        }
        return new GoodsImageUpdateVO(GoodsExecutionServiceEnum.IMAGE_DELETE_FAILED);
    }

    @Override
    public GoodsListReleaseVO listReleaseGoods() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GoodsLookInfoVO lookGoodsInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GoodsSearchVO searchGoods() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void serachGoodsByPage(int pageSize, int currentPage) {
        // TODO Auto-generated method stub

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
