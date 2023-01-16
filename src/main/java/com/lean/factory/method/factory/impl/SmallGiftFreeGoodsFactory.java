package com.lean.factory.method.factory.impl;


import com.lean.factory.method.factory.FreeGoodsFactory;
import com.lean.factory.simple.service.IFreeGoods;
import com.lean.factory.simple.serviceimpl.SmallGiftFreeGoods;

/**
 * 生产小礼品发放接口-具体工厂
 *
 * @author spikeCong
 * @date 2022/9/9
 **/
public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
