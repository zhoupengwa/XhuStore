package com.xhustore.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.User;
import com.xhustore.dto.UserDTO;
import com.xhustore.service.UserService;
import com.xhustore.vo.UserListAllVO;
import com.xhustore.vo.UserLoginVO;
import com.xhustore.vo.UserUpdateHeadImageVO;
import com.xhustore.vo.UserUpdateInfoVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetVerifyCode() {
        fail("Not yet implemented");
    }

    @Test
    public void testRegister() {
        fail("Not yet implemented");
    }

    @Test
    public void testLogin() {
        String phone = "18483638748";
        String password = "12345";
        UserLoginVO loginExecutionDTO = userService.login(phone, password);
        System.out.println(loginExecutionDTO);
    }

    @Test
    public void testUpdateInfo() {
        User user = new User();
        user.setId(1000L);
        user.setNickname("周周");
        user.setCollege("计算机与软件工程学院");
        user.setQqNumber("982352881");
        user.setWechatNumber("982352881");
        user.setIntroduce("西瓜最大的游戏军火商");
        UserUpdateInfoVO vo = userService.updateInfo(user);
        System.out.println(vo);
    }

    @Test
    public void testUpdateHeadImage() {
        Long id = 1005L;
        String headImage = "1.jpg";
        UserUpdateHeadImageVO vo = userService.updateHeadImage(id, headImage);
        System.out.println(vo);
    }

    @Test
    public void testLookInfo() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdatePassword() {
        fail("Not yet implemented");
    }

    @Test
    public void testResetPassword() {
        fail("Not yet implemented");
    }

    @Test
    public void testListAllUser() {
        UserListAllVO vo = userService.listAllUser();
        System.out.println(vo);
    }

    @Test
    public void testDeleteUser() {
        fail("Not yet implemented");
    }

}
