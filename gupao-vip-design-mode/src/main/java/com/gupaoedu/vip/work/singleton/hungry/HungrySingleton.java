package com.gupaoedu.vip.work.singleton.hungry;

/**
 * @Description  饱汉式单例模式
 * @Date: create in 11:41 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class HungrySingleton {

    /*
    * 饱汉式单例模式
    * 优点：不存在线程安全问题
    * 缺点：对象在类被初始化的时候就被加载到内存，不管有没有被调用，从而占用内存空间，造成资源浪费
    *
    * */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
