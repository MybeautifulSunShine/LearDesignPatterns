package com.lean.factory.simple.service;


import com.lean.factory.schemes01.entity.AwardInfo;
import com.lean.factory.simple.entity.ResponseResult;


/**
 * 描述:
 * 发送接口类
 *
 * @author HGJ
 * @version 1.0
 * @create 2023-01-16 11:13
 */
public interface IFreeGoods {
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
