package com.hb.model;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class GuestDao {
    private SqlMapClient sqlMap;

    public GuestDao() throws IOException {
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    public List selectAll() throws SQLException {
        List list = sqlMap.queryForList("selectAll");

        return list;
    }

    public GuestVo selectOne(int sabun) throws SQLException {
        GuestVo bean = (GuestVo) sqlMap.queryForObject("selectOne", sabun);

        return bean;
    }

    public void insertOne(GuestVo bean) throws SQLException {
        sqlMap.insert("insertOne", bean);
    }

    public void updateOne(GuestVo bean) throws SQLException {
        sqlMap.update("updateOne", bean);
    }
}
