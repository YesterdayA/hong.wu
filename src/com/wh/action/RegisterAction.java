package com.wh.action;

import com.opensymphony.xwork2.ModelDriven;
import com.wh.dao.UsersDao;
import com.wh.daoImpl.UsersDaoImpl;
import com.wh.entity.Users;

public class RegisterAction extends SuperAction implements ModelDriven<Users>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users users = new Users();
	private String password2;
	
	//用户注册功能的实现
	public String Register() throws Exception{
		UsersDao udao = new UsersDaoImpl();
		if(udao.add(users)==false){
			return "register_failure";
		}else{
			session.setAttribute("username", users.getUsername());
		    return "register_success";
		}
	}

	
	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return users;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	
}
