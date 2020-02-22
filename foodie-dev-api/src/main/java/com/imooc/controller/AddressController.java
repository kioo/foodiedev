package com.imooc.controller;

import com.imooc.pojo.UserAddress;
import com.imooc.service.AddressService;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "地址相关", tags = {"地址相关接口api接口"})
@RestController
@RequestMapping("address")
public class AddressController {

    final static Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;
    /**
     * 用户在确认订单页面, 可以针对收货地址做如下操作
     * 1. 查询用户的所有收货地址列表
     * 2. 新增收货地址
     * 3. 删除收货地址
     * 4. 修改收货地址
     * 5. 设置默认地址
     *
     */

    @ApiOperation(value = "根据用户id 查询用户收货地址列表", notes = "根据用户id 查询用户收货地址列表", httpMethod = "POST")
    @PostMapping("/list")
    public IMOOCJSONResult list(@RequestParam String userId){

        if(StringUtils.isBlank(userId)){
            return IMOOCJSONResult.errorMsg("");
        }

        List<UserAddress> list = addressService.queryAll(userId);

        return IMOOCJSONResult.ok(list);
    }


}
