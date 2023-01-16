package com.lean.factory.method.factory.impl;


import com.lean.factory.method.factory.FreeGoodsFactory;
import com.lean.factory.simple.service.IFreeGoods;
import com.lean.factory.simple.serviceimpl.DiscountFreeGoods;

/**
 * 生产优惠券发放接口-具体工厂
 *
 * @author spikeCong
 * @date 2022/9/9
 **/
public class DiscountFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInstance() {
        //返回的是具体产品
        return new DiscountFreeGoods();
    }
}
