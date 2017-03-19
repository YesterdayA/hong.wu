package com.wh.entity;

import java.util.HashSet;
import java.util.Set;

public class GoodsType {
	private int goodsTypeId;
	private String goodsTypeName;
	private Set goods = new HashSet(0);
		
	public GoodsType() {
		
	}
	

	public GoodsType(String goodsTypeName, Set goods) {
		super();
		this.goodsTypeName = goodsTypeName;
		this.goods = goods;
	}


	public int getGoodsTypeId() {
		return goodsTypeId;
	}
	public void setGoodsTypeId(int goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	public String getGoodsTypeName() {
		return goodsTypeName;
	}
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public Set getGoods() {
		return goods;
	}

	public void setGoods(Set goods) {
		this.goods = goods;
	}
	
	

}
