package com.xhustore.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xhustore.domain.Releases;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class ReleaseDaoTest {
    @Autowired
    private ReleasesDao releaseDao;

    @Test
    public void testInsert() {
        Releases release = new Releases(1000L, 1000L);
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

}
