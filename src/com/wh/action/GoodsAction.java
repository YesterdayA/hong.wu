package com.wh.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wh.dao.GoodsTypeDao;
import com.wh.daoImpl.GoodsTypeDaoImpl;
import com.wh.entity.Goods;
import com.wh.entity.GoodsType;

public class GoodsAction extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7204792558654469116L;

	//用于封装商品信息和商品分类
	private Goods goods;
	private GoodsType goodstype;
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public GoodsType getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	//显示商品分类信息
	public String ShowGoodsType(){
		GoodsTypeDao gtd = new GoodsTypeDaoImpl();
		List<GoodsType> list = gtd.getGoodsType();
		if(list== null || "".equals(list)){
			return "error";
		}else{
			//goodstype = (GoodsType)list;
			//System.out.println("hahhahhahh"+goodstype.getGoodsTypeId()+"啊哈哈哈哈"+goodstype.getGoodsTypeName());
			//goodstype= (GoodsType)gtd.getGoodsType();
			request.put("GoodsType", list);
			return "ShowGoodsType";

		}
	}
	
	
	
}
