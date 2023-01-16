package com.geely.design.pattern.creational.abstractfactory;


/**
 * 产品族类
 * @return
 */
public interface CourseFactory {

    //获取视频
    Video getVideo();
    //获取手记
    Article getArticle();

}
