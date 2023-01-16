package com.lean.factory.method.factory;


import com.lean.factory.simple.service.IFreeGoods;

/**
 * 抽象工厂
 *
 * @author spikeCong
 * @date 2022/9/9
 **/
public interface FreeGoodsFactory {

    IFreeGoods getInstance();
}
