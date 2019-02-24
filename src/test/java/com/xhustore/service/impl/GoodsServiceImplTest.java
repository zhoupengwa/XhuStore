package com.xhustore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Goods;
import com.xhustore.domain.Image;
import com.xhustore.dto.GoodsDTO;
import com.xhustore.enums.GoodsTypeEnum;
import com.xhustore.service.GoodsService;
import com.xhustore.vo.GoodsDeleteVO;
import com.xhustore.vo.GoodsImageUpdateVO;
import com.xhustore.vo.GoodsListReleaseVO;
import com.xhustore.vo.GoodsLookInfoVO;
import com.xhustore.vo.GoodsReleaseVO;
import com.xhustore.vo.GoodsSearchByPageVO;
import com.xhustore.vo.GoodsSearchVO;
import com.xhustore.vo.GoodsUpdateVO;

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

        List<Image> imageList = new ArrayList<>();
        imageList.add(new Image(0L, "1.jpg"));
        imageList.add(new Image(0L, "2.jpg"));
        GoodsReleaseVO vo = goodsService.releaseGoods(1000L, goods, imageList);
        System.out.println(vo);
    }

    @Test
    public void testDeleteGoods() {
        GoodsDeleteVO vo = goodsService.deleteGoods(1000L, 1000L);
        System.out.println(vo);
    }

    @Test
    public void testUpdateGoods() {
        Goods goods = new Goods();
        goods.setId(1001L);
        goods.setName("二手强劲自行车");
        goods.setType("二手车哦");
        goods.setPrice(99.8F);
        goods.setDepict("买了刚一个月");
        goods.setAmount(1);
        Long userId = 1000L;
        GoodsUpdateVO vo = goodsService.updateGoods(userId, goods);
        System.out.println(vo);
    }

    @Test
    public void testAddImage() {
        Long goodsId = 1001L;
        Long userId = 1000L;
        String imagePath = "3.jpg";
        GoodsImageUpdateVO vo = goodsService.addImage(userId, goodsId, imagePath);
        System.out.println(vo);
    }

    @Test
    public void testDeleteImage() {
        Long userId = 1000L;
        Long goodsId = 1001L;
        Long imageId = 1002L;
        GoodsImageUpdateVO vo = goodsService.deleteImage(userId, goodsId, imageId);
        System.out.println(vo);
    }

    @Test
    public void testListReleaseGoods() {
        Long userId = 1000L;
        GoodsListReleaseVO vo = goodsService.listReleaseGoods(userId);
        System.out.println(vo);
    }

    @Test
    public void testLookGoodsInfo() {
        Long goodsId = 1001L;
        GoodsLookInfoVO vo = goodsService.lookGoodsInfo(goodsId);
        System.out.println(vo);
    }

    @Test
    public void testSearchGoods() {
        String name = "二";
        String type=null;
        Float minPrice = 98.4F;
        Float maxPrice = null;
        boolean orderByPriceDesc = true;
        GoodsSearchVO vo = goodsService.searchGoods(name,type, minPrice, maxPrice, orderByPriceDesc);
        System.out.println(vo);
    }

    @Test
    public void testSerachGoodsByPage() {
        String name = null;
        String type="服装";
        Float minPrice = null;
        Float maxPrice = null;
        boolean orderByPriceDesc = false;
        int pageSize=3;
        int currentPage=2;
        GoodsSearchByPageVO<List<GoodsDTO>> vo = goodsService.serachGoodsByPage(name,type, minPrice, maxPrice, orderByPriceDesc, pageSize, currentPage);
        System.out.println(vo);
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
