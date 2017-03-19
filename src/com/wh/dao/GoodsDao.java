package com.wh.dao;

import java.util.List;

public interface GoodsDao {
	//查询所有商品
	public List getAllGoods();
	//根据类型编号查找对应的商品
	public List getGoodsByID(int goodstyeid);
	
}
