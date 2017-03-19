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

	//管理员添加用户
	@Override
	public void add(Users users) {
		// TODO Auto-generated method stub
		
	}

	//管理员刪除用戶
	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		
	}

	//管理员查詢用戶
	@Override
	public Users get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	//管理员修改用戶資料
	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		
	}

	//管理员登录验证
	@Override
	public boolean validate(String admin, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
