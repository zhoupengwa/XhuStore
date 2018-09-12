package com.xhustore.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setPhone("18483638748");
        user.setPassword("123456");
        int count = userDao.insertUser(user);
        System.out.println(count);
    }

    @Test
    public void testUpdateUser() {

    }

}
