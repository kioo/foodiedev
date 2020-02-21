package com.imooc.controller;

import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "地址相关", tags = {"地址相关接口api接口"})
@RestController
@RequestMapping("index")
public class AddressController {

    final static Logger logger = LoggerFactory.getLogger(AddressController.class);

    /**
     * 用户在确认订单页面, 可以针对收货地址做如下操作
     * 1. 查询用户的所有收货地址列表
     * 2. 新增收货地址
     * 3. 删除收货地址
     * 4. 修改收货地址
     * 5. 设置默认地址
     *
     */

    @ApiOperation(value = "获取首页轮播图列表", notes = "获取首页轮播图列表", httpMethod = "GET")
    @GetMapping("/carousel")
    public IMOOCJSONResult carousel(){



        return IMOOCJSONResult.ok();
    }


}
