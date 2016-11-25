package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action{
    private int idx;
    private GuestVo bean;

    public GuestVo getBean() {
        return bean;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @Override
    public String execute() throws Exception {
        bean = new GuestDao().selectOne(idx);
        return SUCCESS;
    }
}
