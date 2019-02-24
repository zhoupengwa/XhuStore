package com.xhustore.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Image;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class ImageDaoTest {
    @Autowired
    private ImageDao imageDao;

    @Test
    public void testInsert() {
        Image image = new Image();
        image.setGoodsId(1000L);
        image.setImage("2.jpg");
        int count = imageDao.insert(image);
        assert count == 1;
    }

    @Test
    public void testDelete() {
        Long id = 1005L;
        Long goodsId = 1009L;
        int count = imageDao.delete(id, goodsId);
        assert count == 1;
    }

    @Test
    public void testCount() {
        Long goodsId = 1009L;
        Long count = imageDao.count(goodsId);
        System.out.println(count);
    }

    @Test
    public void testQueryFirstImage() {
        Long goodsId = 1090L;
        String image = imageDao.queryFirstImage(goodsId);
        System.out.println(image);
    }

}
