package com.wh.dao;

import java.util.List;

import com.wh.entity.Users;

public interface UsersDao {
	//����Ñ�
	public boolean add(Users users);
	//�h���Ñ�
	public void delete(Users users);
	//��ԃ�Ñ�
	public Users get(int id);
	//�޸��Ñ��Y��
	public void update(Users users);
	//�û���¼��֤
	public List search(Users users);
}
