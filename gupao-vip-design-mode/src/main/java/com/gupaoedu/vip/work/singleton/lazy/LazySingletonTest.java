package com.gupaoedu.vip.work.singleton.lazy;

import com.gupaoedu.vip.work.singleton.hungry.HungrySingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Date: create in 14:05 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
    }
}
