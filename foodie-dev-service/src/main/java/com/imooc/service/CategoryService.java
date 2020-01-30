package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;

import java.util.List;

public interface CategoryService {

    /**
     * 查询所有住分类
     * @return
     */
    public List<Category> queryAllRootLevelCat();

    /**
     * 查询子分类
     * @param rootCatId
     * @return
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);

    /**
     * 查询首页每个商品的具体分类
     * @param rootCatId
     * @return
     */
    public List<NewItemsVO> getSixNewItemsLazy(Integer rootCatId);
}
