package com.wh.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wh.SessionFactory.HibernateSessionFactory;
import com.wh.action.UsersAction;
import com.wh.dao.BaseHibernateDao;
import com.wh.dao.UsersDao;
import com.wh.entity.Users;

public class UsersDaoImpl extends BaseHibernateDao implements UsersDao {

	//添加数据
	@Override
	public boolean add(Users users) {
		users.setUid(getNewUid());
		if(super.add(users)==false){
			return false;
		}else{
			return true;
		}			
	}
	
	//删除数据
	@Override
	public void delete(Users users) {
		super.delete(users);		
	}

	//加载数据
	@Override
	public Users get(int id) {
		return (Users)super.get(Users.class, id);
	}

	//修改数据
	@Override
	public void update(Users users) {
		super.update(users);		
	}

	//登录验证
	@Override
	public List search(Users users) {
		if(users.getUsername()==null || "".equals(users.getUsername())){
			return null;
		}else{
			//users.setUsername(username);
			//users.setPassword(password);
		    //调用BaseHibernateDAO类中的search方法
			//List list=super.search(Users.class, users);
			return super.search(Users.class, users);
		}
		
	}
	//获取当前用户的最大编号，并生成一个新的编号
	public int getNewUid(){
		Session session = null;
		Transaction tx = null;
		int uid=0;
		String hql = "";
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			hql="select distinct max(uid) from Users";
			Query query = session.createQuery(hql);
			tx.commit();
			if(query.uniqueResult()==null||"".equals(query.uniqueResult())){
				uid = 1;
			}else{
				uid =(int) query.uniqueResult();
				uid++;
			}
		}catch(Exception e){
			if(tx!=null){
				//事务回滚
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			//关闭session
			HibernateSessionFactory.closeSession();
		}
		return uid;
	}
	//获取当前的用户uid编号
	public int getUsersUid(){
		Users users =new Users();
		Session session = null;
		Transaction tx = null;
		int uid=0;
		String hql = "";
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			hql="select uid from Users where username=? and password=?";
			Query query = session.createQuery(hql);
			System.out.println("hahahah"+users.getUsername());
			System.out.println("xixixixixixixixxiixxiix"+users.getPassword());
            query.setParameter(0, "users.getUsername()");
            query.setParameter(1, "users.getPassword()");
			tx.commit();
			uid =(int) query.uniqueResult();
		}catch(Exception e){
			if(tx!=null){
				//事务回滚
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			//关闭session
			HibernateSessionFactory.closeSession();
		}
		return uid;
	}
}

