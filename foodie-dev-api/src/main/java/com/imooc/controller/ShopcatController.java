package com.imooc.controller;

import com.imooc.enums.YesOrNo;
import com.imooc.pojo.Carousel;
import com.imooc.pojo.Category;
import com.imooc.pojo.bo.ShopcartBO;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;
import com.imooc.service.CarouselService;
import com.imooc.service.CategoryService;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(value = "购物车接口controller", tags = {"购物车接口controller"})
@RestController
@RequestMapping("shopcart")
public class ShopcatController {

    final static Logger logger = LoggerFactory.getLogger(ShopcatController.class);


    @ApiOperation(value = "添加商品到购物车", notes = "添加商品到购物车", httpMethod = "POST")
    @PostMapping("/add")
    public IMOOCJSONResult add(@RequestParam String userId,
                               @RequestBody ShopcartBO shopcartBO,
                               HttpServletRequest request,
                               HttpServletResponse response){

        if(StringUtils.isBlank(userId)){
            return  IMOOCJSONResult.errorMsg("");
        }

        System.out.println(shopcartBO);
     // TODO 前段用户在登录的情况下, 添加商品到购物车,会同时在后端同步购物车到redis 缓存

        return IMOOCJSONResult.ok();
    }


}
