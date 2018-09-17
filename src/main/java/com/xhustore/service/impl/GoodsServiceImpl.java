package com.xhustore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhustore.dao.GoodsDao;
import com.xhustore.domain.Goods;
import com.xhustore.enums.GoodsServiceEnum;
import com.xhustore.service.GoodsService;
import com.xhustore.vo.GoodsDeleteVO;
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

    @Override
    public GoodsReleaseVO releaseGoods(Goods goods) {
        int count = goodsDao.insert(goods);
        if (count == 1) {
            return new GoodsReleaseVO(GoodsServiceEnum.RELEASE_SUCCESS, goods.getId());
        }
        return new GoodsReleaseVO(GoodsServiceEnum.RELEASE_FAILED, null);
    }

    @Override
    public GoodsDeleteVO deleteGoods() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GoodsUpdateVO updateGoods() {
        // TODO Auto-generated method stub
        return null;
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
