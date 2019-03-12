package com.gupaoedu.vip.work.singleton.hungry;

/**
 * @Description
 * @Date: create in 14:05 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
