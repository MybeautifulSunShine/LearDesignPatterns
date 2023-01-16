package com.lean.factory.method.web;

import com.lean.factory.method.factory.FreeGoodsFactory;
import com.lean.factory.method.factory.FreeGoodsFactoryMap;
import com.lean.factory.schemes01.entity.AwardInfo;
import com.lean.factory.simple.entity.ResponseResult;
import com.lean.factory.simple.service.IFreeGoods;

/**
 * 发放奖品接口
 *
 * @author spikeCong
 * @date 2022/9/9
 **/
public class DeliverController {

    //发放奖品
    public ResponseResult awardToUser(AwardInfo awardInfo) {

//        //根据类型获取具体工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardTypes());
//
//        //从工厂类中获取对应实例
        IFreeGoods iFreeGoods = goodsFactory.getInstance();
//
//        System.out.println("==========工厂方法模式=============");
        ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
        return responseResult;
    }
}
