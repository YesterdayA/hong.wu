package com.wh.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.wh.dao.GoodsTypeDao;
import com.wh.daoImpl.GoodsTypeDaoImpl;

public class TestGoodsDaoImpl {
	@Test
	public void testGoodsTypeDao(){
		GoodsTypeDao goodtype = new GoodsTypeDaoImpl();
		List list = goodtype.getGoodsType();
			System.out.print(list.get(0));
	}

}
