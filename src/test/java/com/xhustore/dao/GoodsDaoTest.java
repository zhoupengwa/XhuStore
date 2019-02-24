package com.xhustore.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Goods;
import com.xhustore.dto.GoodsDTO;
import com.xhustore.dto.GoodsDetailDTO;
import com.xhustore.enums.GoodsTypeEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void testInsert() {
        Goods goods = new Goods();
        goods.setName("新款口红");
        goods.setDepict("刚买不到一个月，自己用不上，低价抛售");
        goods.setAmount(1);
        goods.setType(GoodsTypeEnum.CLOSES.getName());
        goods.setPrice(99.9F);
        int count = goodsDao.insert(goods);
        System.out.println(count);
        // assert count == 1;
    }

    @Test
    public void testUpdate() {
        Goods goods = new Goods();
        goods.setId(1007L);
        goods.setName("二手强劲自行车");
        goods.setType("二手车哦");
        goods.setPrice(99.8F);
        goods.setDepict("买了刚一个月");
        goods.setAmount(1);
        int count = goodsDao.update(goods);
        assert count == 1;
    }

    @Test
    public void testDelete() {
        Long id = 1004L;
        int count = goodsDao.delete(id);
        System.out.println(count);
    }

    @Test
    public void testQueryById() {
        Long id = 1000L;
        GoodsDetailDTO goodsDTO = goodsDao.queryById(id);
        System.out.println(goodsDTO);
    }

    @Test
    public void testListGoods() {
        List<GoodsDTO> dtos = goodsDao.listGoods(null,"电子", null, null, null);
        for (GoodsDTO dto : dtos) {
            System.out.println(dto.toString());
        }
    }

    @Test
    public void testCount() {
        Long countSum = goodsDao.count(null,"服", null, 200.5f);
        System.out.println(countSum);
    }

    @Test
    public void testListGoodsByPage() {
        List<GoodsDTO> dtos = goodsDao.listGoodsByPage(null,"服", null, 200.5f, false, 2, 1);
        for (GoodsDTO dto : dtos) {
            System.out.println(dto.toString());
        }
    }
}
