package com.xhustore.dao;

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
        user.setPhone("18483638749");
        user.setPassword("123456");
        int count = userDao.insert(user);
        assert count == 1;
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(1000L);
        user.setNickname("周周");
        user.setCollege("汽车与交通学院");
        user.setQqNumber("982352881");
        user.setWechatNumber("982352881");
        user.setIntroduce("西瓜最大的游戏军火商");
        int count = userDao.update(user);
       // assert count == 1;
        System.out.println(count);
    }

    @Test
    public void testUpdateHeadImage() {
        Long id = 1000L;
        String headImage = "1.jpg";
        int count = userDao.updateHeadImage(id, headImage);
        assert count == 1;
    }
    @Test
    public void testUpdatePassword() {
        Long id = 1000L;
        String password = "123";
        int count = userDao.updatePassword(id, password);
        assert count == 1;
    }
}
