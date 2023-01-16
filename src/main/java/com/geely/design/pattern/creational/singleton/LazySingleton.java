package com.geely.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geely
 */
public class LazySingleton {
        private static LazySingleton lazySingleton = null;
        private  static boolean flag =true;
        private LazySingleton(){
            if (flag){
                flag=false;
            }else {
                throw new RuntimeException("单例构造器禁止反射调用");
            }
        }
        public synchronized static LazySingleton getInstance(){
            if(lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();
        //获取到flag 这个字段
        Field flag = o1.getClass().getDeclaredField("flag");
        //修改权限也就是说private 失效了
        flag.setAccessible(true);
        flag.set(o1,true);


        LazySingleton o2 = (LazySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }

}
