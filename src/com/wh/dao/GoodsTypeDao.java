package com.wh.dao;

import java.util.List;

import com.wh.entity.GoodsType;

public interface GoodsTypeDao {

	//获得商品分类列表
	public List<GoodsType>  getGoodsType();
}
