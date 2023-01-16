package com.geely.design.pattern.creational.abstractfactory;

/**
 * java视频类
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
