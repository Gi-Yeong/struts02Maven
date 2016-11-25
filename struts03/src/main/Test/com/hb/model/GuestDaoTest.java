package com.hb.model;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class GuestDaoTest {
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