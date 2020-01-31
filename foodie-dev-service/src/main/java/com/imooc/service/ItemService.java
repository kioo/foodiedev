package com.imooc.service;

import com.imooc.pojo.*;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;

import java.util.List;

public interface ItemService {

    // 根据商品id 查询详情
    public Items queryItemById(String id);
// 根据商品id 查询商品图片列表
    public List<ItemsImg> queryItemImgList(String itemId);

    // 根据商品id 查询商品规格
    public List<ItemsSpec> queryItemSpecList(String itemId);

    // 根据商品id 查询商品参数
    public ItemsParam queryItemParam(String itemId);

}
