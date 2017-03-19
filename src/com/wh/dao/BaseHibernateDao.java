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
	 * �������
	 * @param object
	 */
	protected boolean add(Object object){
		Transaction tran=null;
		//��ȡsession
		Session session=HibernateSessionFactory.getSession();
		try{
			//��ʼ����
			tran=session.beginTransaction();
			//�־û�����
		    session.save(object);
		    //�ύ����
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				//����ع�
				tran.rollback();
			}
			e.printStackTrace();
			return false;
		}finally{
			//�ر�session
			HibernateSessionFactory.closeSession();
		}
		return true;
	}		
	/**
	 * ��������
	 * @param cla
	 * @param id
	 * @return
	 */
	protected Object get(Class cla,Serializable id){
		Object object=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			object=session.get(cla, id); //�����ݿ��л�ȡ��id������
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return object;
	}		
	/**
	 * ɾ������
	 * @param object
	 */
	protected void delete(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.delete(object);  //ɾ�����ҵĶ��󣨴�ʱ��Object����������̬��
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
	 * �޸�����
	 * @param object
	 */
	protected void update(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.saveOrUpdate(object); //��������ӵ����ݿ�
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
	
	
	//��ϲ�ѯ
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
