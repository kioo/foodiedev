package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.UserAddress;

import java.util.List;

public interface AddressService {

    /**
     * 根据用户id 查询用户列表
     */
    public List<UserAddress> queryAll(String userId);
}
