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

	//�������
	@Override
	public boolean add(Users users) {
		users.setUid(getNewUid());
		if(super.add(users)==false){
			return false;
		}else{
			return true;
		}			
	}
	
	//ɾ������
	@Override
	public void delete(Users users) {
		super.delete(users);		
	}

	//��������
	@Override
	public Users get(int id) {
		return (Users)super.get(Users.class, id);
	}

	//�޸�����
	@Override
	public void update(Users users) {
		super.update(users);		
	}

	//��¼��֤
	@Override
	public List search(Users users) {
		if(users.getUsername()==null || "".equals(users.getUsername())){
			return null;
		}else{
			//users.setUsername(username);
			//users.setPassword(password);
		    //����BaseHibernateDAO���е�search����
			//List list=super.search(Users.class, users);
			return super.search(Users.class, users);
		}
		
	}
	//��ȡ��ǰ�û�������ţ�������һ���µı��
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
				//����ع�
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			//�ر�session
			HibernateSessionFactory.closeSession();
		}
		return uid;
	}
	//��ȡ��ǰ���û�uid���
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
				//����ع�
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			//�ر�session
			HibernateSessionFactory.closeSession();
		}
		return uid;
	}
}

