package com.wh.dao;

import java.util.List;

public interface GoodsDao {
	//��ѯ������Ʒ
	public List getAllGoods();
	//�������ͱ�Ų��Ҷ�Ӧ����Ʒ
	public List getGoodsByID(int goodstyeid);
	
}
