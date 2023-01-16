package com.lean.factory.simple.serviceimpl;


import com.lean.factory.simple.entity.AwardInfo;
import com.lean.factory.simple.entity.ResponseResult;
import com.lean.factory.simple.service.IFreeGoods;

/**
 * 优酷 会员服务
 *
 * @author spikeCong
 * @date 2022/9/8
 **/
public class YouKuMemberFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("发放优酷会员成功,绑定手机号: " + phone);
        return new ResponseResult("200", "优酷会员发放成功!");
    }
}
