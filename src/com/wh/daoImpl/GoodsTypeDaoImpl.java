package com.wh.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wh.SessionFactory.HibernateSessionFactory;
import com.wh.dao.BaseHibernateDao;
import com.wh.dao.GoodsTypeDao;
import com.wh.entity.GoodsType;

public class GoodsTypeDaoImpl implements GoodsTypeDao {

	//取得商品分类列表
	@Override
	public List<GoodsType> getGoodsType() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx=null;
		List<GoodsType>  list = null;
		Criteria c=null;
		try {
			session=HibernateSessionFactory.getSession();
		    c=session.createCriteria(GoodsType.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//HibernateSessionFactory.closeSession();
		}
		return  c.list();
	}

	/*public List getGoodsType() {
		Session session = null;
		Transaction tx=null;
		List list = null;
		String hql="";
		try {
			session=HibernateSessionFactory.getSession();
			tx=session.beginTransaction();
			hql="From GoodsType";
			list=session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			HibernateSessionFactory.closeSession();
		}
		return list;	*/


}

	
