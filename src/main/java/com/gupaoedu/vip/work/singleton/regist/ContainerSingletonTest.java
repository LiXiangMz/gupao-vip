package com.gupaoedu.vip.work.singleton.regist;

import com.gupaoedu.vip.work.singleton.lazy.LazySingleton;

/**
 * @Description
 * @Date: create in 14:05 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
        }).start();
        new Thread(()->{
            System.out.println(ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
        }).start();
        new Thread(()->{
            System.out.println(ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
        }).start();
        new Thread(()->{
            System.out.println(ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
        }).start();
        new Thread(()->{
            System.out.println(ContainerSingleton.getInstance(ContainerSingleton.class.getName()));
        }).start();
    }
}
