package com.gupaoedu.vip.work.singleton.lazy;

/**
 * @Description  饿汉式单例模式
 * @Date: create in 14:09 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class LazySingleton {

    /*
    * 饿汉式单例模式
    * 优点：对象在第一次获取单例对象时被初始化，节省内存空间
    * 缺点：存在线程安全问题
    * */

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }
}
