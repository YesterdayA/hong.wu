package com.wh.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wh.SessionFactory.HibernateSessionFactory;
import com.wh.dao.AdminDao;
import com.wh.dao.BaseHibernateDao;
import com.wh.entity.Users;

public class AdminDaoImpl extends BaseHibernateDao implements AdminDao{

	//����Ա����û�
	@Override
	public void add(Users users) {
		// TODO Auto-generated method stub
		
	}

	//����Ա�h���Ñ�
	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		
	}

	//����Ա��ԃ�Ñ�
	@Override
	public Users get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	//����Ա�޸��Ñ��Y��
	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		
	}

	//����Ա��¼��֤
	@Override
	public boolean validate(String admin, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
