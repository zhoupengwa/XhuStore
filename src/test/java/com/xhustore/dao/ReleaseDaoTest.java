package com.xhustore.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Releases;
import com.xhustore.dto.ReleasesGoodsDTO;
import com.xhustore.dto.UserDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class ReleaseDaoTest {
    @Autowired
    private ReleasesDao releaseDao;

    @Test
    public void testInsert() {
        Releases release = new Releases(1003L, 1005L);
        int count = releaseDao.insert(release);
        assert count == 1;
    }

    @Test
    public void testDelete() {
        Long id = 1000L;
        int count = releaseDao.delete(id);
        System.out.println(count);
    }

    @Test
    public void testQueryReleasesId() {
        Long id = releaseDao.queryReleasesId(1000L, 1001L);
        System.out.println(id);
    }

    @Test
    public void testListReleasesGoods() {
        Long userId = 1000L;
        List<ReleasesGoodsDTO> releasesGoodsDTOList = releaseDao.listReleasesGoods(userId);
        System.out.println(releasesGoodsDTOList.toString());
    }

    @Test
    public void testQueryUserByGoodsId() {
        Long goodsId = 1001L;
        UserDTO userDTO = releaseDao.queryUserByGoodsId(goodsId);
        System.out.println(userDTO);
    }
}
