package com.imooc.service;

import com.imooc.pojo.*;
import com.imooc.pojo.vo.*;
import com.imooc.utils.PagedGridResult;

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

    /**
     * 根据商品 id 查询商品的评价等级数量
     */
    public CommentLevelCountsVO queryCommentCounts(String itemId);

    /**
     * 根据商品id查询商品评价
     * @param itemId
     * @param level
     * @return
     */
    public PagedGridResult queryPagedComments(String itemId, Integer level,
                                              Integer page, Integer pageSize);

    /**
     * 搜索商品列表
     * @param keywords
     * @param sort
     * @param page
     * @param pageSize
     * @return
     */
    public PagedGridResult searchItems(String keywords, String sort,
                                              Integer page, Integer pageSize);

    /**
     * 根据商品id 搜索
     * @param catId
     * @param sort
     * @param page
     * @param pageSize
     * @return
     */
    public PagedGridResult searchItemsByThirdCat(Integer catId, String sort,
                                       Integer page, Integer pageSize);

    /**
     * 根据规格ids 查询最新购物车中商品的数据(用于刷新购物车中的数据)
     * @param specIds
     * @return
     */
    public List<ShopcartVO> queryItemsBySpecIds(String specIds);
}
