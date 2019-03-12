package com.gupaoedu.vip.work.singleton.lazy;

/**
 * @Description
 * @Date: create in 14:28 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class LazyDoubleCheckSingleton {

    /*
    * 饿汉式双重检查单例模式
    * 优点：不存在线程安全问题，及饿汉式单例模式的优点
    * 缺点：加锁影响性能
    * */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){

        if (null == lazyDoubleCheckSingleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if (null == lazyDoubleCheckSingleton){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    return lazyDoubleCheckSingleton;
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
