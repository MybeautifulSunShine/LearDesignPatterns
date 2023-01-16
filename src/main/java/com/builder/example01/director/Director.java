package com.builder.example01.director;


import com.builder.example01.builder.Builder;
import com.builder.example01.product.Bike;

/**
 * 指挥者类
 *
 * @author spikeCong
 * @date 2022/9/19
 **/
public class Director {

    private Builder mBuilder;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }


    //自行车制作方法
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
