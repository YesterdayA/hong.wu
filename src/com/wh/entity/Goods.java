package com.wh.entity;

public class Goods {

	private int goodsId;
	private String goodsName;
	private GoodsType goodsType;
	private String goodsBrief;
	private int goodsPrice;
	private String goodsImageName;
	private int sellCount;
	private String  goodsDate;
	private int storedCount;
	
	public Goods(){
		
	}
	public Goods(int goodsId, String goodsName, int goodsTypeId,
			String goodsBrief, int goodsPrice, String goodsImageName,
			int sellCount, String goodsDate, int storedCount) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsBrief = goodsBrief;
		this.goodsPrice = goodsPrice;
		this.goodsImageName = goodsImageName;
		this.sellCount = sellCount;
		this.goodsDate = goodsDate;
		this.storedCount = storedCount;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
	public String getGoodsBrief() {
		return goodsBrief;
	}
	public void setGoodsBrief(String goodsBrief) {
		this.goodsBrief = goodsBrief;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsImageName() {
		return goodsImageName;
	}
	public void setGoodsImageName(String goodsImageName) {
		this.goodsImageName = goodsImageName;
	}
	public int getSellCount() {
		return sellCount;
	}
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	public String getGoodsDate() {
		return goodsDate;
	}
	public void setGoodsDate(String goodsDate) {
		this.goodsDate = goodsDate;
	}
	public int getStoredCount() {
		return storedCount;
	}
	public void setStoredCount(int storedCount) {
		this.storedCount = storedCount;
	}

	
}
