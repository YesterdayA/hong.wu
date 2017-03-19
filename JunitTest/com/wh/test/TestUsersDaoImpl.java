package com.wh.test;

import junit.framework.Assert;

import org.junit.Test;

import com.wh.dao.UsersDao;
import com.wh.daoImpl.UsersDaoImpl;
import com.wh.entity.Users;

public class TestUsersDaoImpl {

	@Test
	public void testUsersLogin(){
		//Users users = new Users(1,"zhangsan","123456","男","张三","1993-01-02","上海浦东新区X路X街");
		UsersDao udao = new UsersDaoImpl();
		//Assert.assertEquals(true, udao.validate(users.getUsername(),users.getPassword()));
	}
	@Test
	public void testGetNewUid(){
		UsersDaoImpl udao = new UsersDaoImpl();
		System.out.print(udao.getNewUid());
	}
	@Test
	public void testGetUsersUid(){
		UsersDaoImpl udao = new UsersDaoImpl();
		Users users = new Users();
		udao.getUsersUid();
	}
}
