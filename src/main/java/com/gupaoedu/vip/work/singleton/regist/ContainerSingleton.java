package com.gupaoedu.vip.work.singleton.regist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description  注册式单例
 * @Date: create in 15:00 2019/3/12
 * @Author: lixiang
 * @Modify By:
 */
public class ContainerSingleton {

    private static Map<String,Object> map = new ConcurrentHashMap<>();

    private ContainerSingleton(){}

    public static ContainerSingleton getInstance(String className){
        synchronized (map){
            if (!map.containsKey(className)){
                ContainerSingleton containerSingleton = null;
                try {
                    containerSingleton = (ContainerSingleton)Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                map.put(ContainerSingleton.class.getName(),containerSingleton);
                return containerSingleton;
            }
            return (ContainerSingleton)map.get(className);
        }
    }
}
