package com.gupaoedu.vip.work.singleton.regist;

/**
 * @Description  枚举单例模式
 * @Date: create in 14:44 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object object;

    EnumSingleton(){}

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
