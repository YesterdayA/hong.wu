package com.wh.dao;

import java.util.List;

import com.wh.entity.Users;

public interface UsersDao {
	//添加用戶
	public boolean add(Users users);
	//刪除用戶
	public void delete(Users users);
	//查詢用戶
	public Users get(int id);
	//修改用戶資料
	public void update(Users users);
	//用户登录验证
	public List search(Users users);
}
