package com.hb.model;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class GuestDaoTest {
    @Test
    public void updateOne() throws Exception {
//        GuestVo bean = new GuestVo();
//        bean.setSabun(8888);
//        bean.setName("test2");
//        bean.setPay(8080);
//        Assert.assertNotEquals(bean, dao.selectOne(8888));
//        dao.updateOne(bean);
//        GuestVo vo = dao.selectOne(8888);
//        Assert.assertNotNull(vo);
//        Assert.assertEquals(bean, vo);
//        logger.debug(vo);
    }

    @Test
    public void insertOne() throws Exception {
//        GuestVo bean = new GuestVo();
//        bean.setSabun(8888);
//        bean.setName("test");
//        bean.setNalja(new Date());
//        bean.setPay(9000);
//        dao.insertOne(bean);
//        Assert.assertEquals(bean, dao.selectOne(8888));

    }

    Logger logger = Logger.getLogger(this.getClass());
    private GuestDao dao;

    @Before
    public void settingDao() throws IOException {
        dao = new GuestDao();
    }

    @Test
    public void selectOne() throws Exception {
        int sabun = 1111;
        GuestVo bean = dao.selectOne(1111);
        Assert.assertNotNull(bean);
        Assert.assertEquals(bean.getSabun(), sabun);
        logger.debug(bean);

    }

    @Test
    public void selectAll() throws Exception {
        List<GuestVo> list = dao.selectAll();
        Assert.assertNotNull(list);
        for (GuestVo vo :
                list) {
            logger.debug(vo);
        }

    }

}