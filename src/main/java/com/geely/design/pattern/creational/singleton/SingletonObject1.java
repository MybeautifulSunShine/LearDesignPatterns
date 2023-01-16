package com.geely.design.pattern.creational.singleton;

import java.io.Serializable;

public class SingletonObject1 implements Serializable {

    /**
     * can't lazy load.
     */
    private static final SingletonObject1 instance = new SingletonObject1();

    private SingletonObject1() {
        //empty
        if(instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static SingletonObject1 getInstance() {
        return instance;
    }

    //新加一个方法 是反射出来的
    private Object readResolve() {
        return instance;
    }

}