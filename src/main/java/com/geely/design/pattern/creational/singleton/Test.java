package com.geely.design.pattern.creational.singleton;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;

//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;
////
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//
//        constructor.setAccessible(true);
//        EnumInstance instance = (EnumInstance) constructor.newInstance("Geely",666);

        //????????????
        Class obj = Class.forName(SingletonObject1.class.getName());
        //????????????????????????
        Constructor declaredConstructor = obj.getDeclaredConstructor();
        //?????????????????? SingletonObject1 ?????????private???????????????
        declaredConstructor.setAccessible(true);
        //??????????????????
        SingletonObject1 instance1 = SingletonObject1.getInstance();
        Object instance2 = declaredConstructor.newInstance(SingletonObject1.class);
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 ==instance2);
//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();


//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();


//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();


    }
}
