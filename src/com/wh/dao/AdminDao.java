package com.wh.dao;

import java.util.List;

import com.wh.entity.Users;

public interface AdminDao {
	//����Ա����û�
	public void add(Users users);
	//����Ա�h���Ñ�
	public void delete(Users users);
	//����Ա��ԃ�Ñ�
	public Users get(int id);
	//����Ա�޸��Ñ��Y��
	public void update(Users users);
	//����Ա��¼��֤
	public boolean validate(String admin,String password);
}
