package com.wh.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.wh.SessionFactory.HibernateSessionFactory;
import com.wh.entity.Users;


public class BaseHibernateDao{
	/**
	 * 添加数据
	 * @param object
	 */
	protected boolean add(Object object){
		Transaction tran=null;
		//获取session
		Session session=HibernateSessionFactory.getSession();
		try{
			//开始事务
			tran=session.beginTransaction();
			//持久化操作
		    session.save(object);
		    //提交事务
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				//事务回滚
				tran.rollback();
			}
			e.printStackTrace();
			return false;
		}finally{
			//关闭session
			HibernateSessionFactory.closeSession();
		}
		return true;
	}		
	/**
	 * 加载数据
	 * @param cla
	 * @param id
	 * @return
	 */
	protected Object get(Class cla,Serializable id){
		Object object=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			object=session.get(cla, id); //从数据库中获取第id个数据
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return object;
	}		
	/**
	 * 删除数据
	 * @param object
	 */
	protected void delete(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.delete(object);  //删除查找的对象（此时的Object对象是游离态）
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}		
	/**
	 * 修改数据
	 * @param object
	 */
	protected void update(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.saveOrUpdate(object); //将数据添加到数据库
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	
	//组合查询
	protected List search(Class cla,Object condition){
		Session session=null;
		List list=null;
		try {
			session=HibernateSessionFactory.getSession();		
			list=session.createCriteria(cla).add(Example.create(condition)).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			HibernateSessionFactory.closeSession();
		}
		return list;	
	}
}
