package com.xhustore.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Goods;
import com.xhustore.enums.GoodsTypeEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void testInsert() {
        Goods goods = new Goods();
        goods.setName("二手自行车");
        goods.setDepict("刚买不到一个月，自己用不上，低价抛售");
        goods.setAmount(1);
        goods.setType(GoodsTypeEnum.CLOSES.getName());
        goods.setPrice(99.9F);
        int count = goodsDao.insert(goods);
        assert count == 1;
    }

    @Test
    public void testUpdate() {
      Goods goods=new Goods();
      goods.setId(1000L);
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
        fail("Not yet implemented");
    }

}
