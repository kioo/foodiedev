package com.imooc.service;

import com.imooc.pojo.UserAddress;
import com.imooc.pojo.bo.AddressBO;
import com.imooc.pojo.bo.SubmitOrderBO;

import java.util.List;

public interface OrderService {

    /**
     * 用户创建订单相关信息
     * @param submitOrderBO
     * @return
     */
    public List<SubmitOrderBO> createOrder(SubmitOrderBO submitOrderBO);
}
