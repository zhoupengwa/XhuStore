package com.xhustore.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Goods;
import com.xhustore.enums.GoodsTypeEnum;
import com.xhustore.service.GoodsService;
import com.xhustore.vo.GoodsReleaseVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class GoodsServiceImplTest {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void testReleaseGoods() {

        Goods goods = new Goods();
        goods.setName("二手iphone X");
        goods.setDepict("9成新，低价出售");
        goods.setAmount(1);
        goods.setType(GoodsTypeEnum.CLOSES.getName());
        goods.setPrice(99.9F);
        GoodsReleaseVO vo=goodsService.releaseGoods(goods);
        System.out.println(vo);
    }

    @Test
    public void testDeleteGoods() {
       
    }

    @Test
    public void testUpdateGoods() {
      
    }

    @Test
    public void testListReleaseGoods() {
       
    }

    @Test
    public void testLookGoodsInfo() {
     
    }

    @Test
    public void testSearchGoods() {
       
    }

    @Test
    public void testSerachGoodsByPage() {
       
    }

    @Test
    public void testPurchaseGoods() {
       
    }

    @Test
    public void testListAllGoods() {
        
    }

    @Test
    public void testListAllGoodsByPage() {
      
    }

}
