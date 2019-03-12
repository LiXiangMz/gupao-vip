package com.gupaoedu.vip.work.singleton.threadlocal;

/**
 * @Description  线程内安全的单例模式
 * @Date: create in 15:09 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
