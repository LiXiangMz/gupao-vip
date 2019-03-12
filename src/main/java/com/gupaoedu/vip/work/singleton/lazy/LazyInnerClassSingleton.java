package com.gupaoedu.vip.work.singleton.lazy;


/**
 * @Description  内部类单例模式
 * @Date: create in 14:35 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class LazyInnerClassSingleton {

    /*
    * 饿汉式内部类单例模式
    * 优点：继承了饿汉式的有点，又改善了synchronized的性能安全问题
    * 缺点：
    * */

    private LazyInnerClassSingleton(){
        /*避免反射破坏单例*/
        if(InnerClass.lazyInnerClassSingleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return InnerClass.lazyInnerClassSingleton;
    }

    private static class InnerClass{
        //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
        //如果没使用的话，内部类是不加载的
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
