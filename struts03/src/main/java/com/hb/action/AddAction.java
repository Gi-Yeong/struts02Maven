package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddAction extends ActionSupport implements Preparable, ModelDriven<GuestVo> {
    private GuestVo bean;

    @Override
    public void prepare() throws Exception { // 객체를 상속하면서 재생성 해준다.
        bean = new GuestVo();
    }

    @Override
    public GuestVo getModel() {
        return bean;
    }

    public GuestVo getBean() {
        return bean;
    }

    public void setBean(GuestVo bean) {
        this.bean = bean;
    }

    @Override
    public String execute() throws Exception {
        if (bean.getSabun() == 0 || bean.getName() == null || bean.getName().equals("") || bean.getPay() == 0){
            return INPUT;
        }

        new GuestDao().insertOne(bean);
        return SUCCESS;
    }

    public String pShow(){

        return INPUT;
    }
}
