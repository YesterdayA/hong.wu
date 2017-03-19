package com.wh.dao;

import java.util.List;

import com.wh.entity.Users;

public interface AdminDao {
	//管理员添加用户
	public void add(Users users);
	//管理员刪除用戶
	public void delete(Users users);
	//管理员查詢用戶
	public Users get(int id);
	//管理员修改用戶資料
	public void update(Users users);
	//管理员登录验证
	public boolean validate(String admin,String password);
}
