package com.xhustore.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class OrdersDaoTest {
    @Autowired
    private OrdersDao ordersDao;

    @Test
    public void testInsert() {
        Orders orders = new Orders();
        orders.setGoodsId(1000L);
        orders.setBuyerId(1000L);
        orders.setSellerId(1001L);
        int count = ordersDao.insert(orders);
        assert count == 1;
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

}
