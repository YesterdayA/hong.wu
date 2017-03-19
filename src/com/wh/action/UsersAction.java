package com.wh.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wh.dao.UsersDao;
import com.wh.daoImpl.UsersDaoImpl;
import com.wh.entity.Users;

public class UsersAction extends ActionSupport implements RequestAware,SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2140900505671926352L;
	UsersDao usersdao = new UsersDaoImpl();
	public UsersDao getUsersdao() {
		return usersdao;
	}
	public void setUsersdao(UsersDao usersdao) {
		this.usersdao = usersdao;
	}

	//用于封装用户名和密码
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//用于封装用户注册信息
	private Users users;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	//用户登录方法
	public String Login() throws Exception {
		Users condition=new Users();
		condition.setUsername(username);
		condition.setPassword(password);
		//System.out.print(condition.getUsername());
		//System.out.print(condition.getPassword());
		List list=usersdao.search(condition);
		if("".equals(list) ||list==null){
			return "input";	
		}else{
			//将用户对象存入Session
			session.put("users", list.get(0));	
			return "login_success";
		}
	}
	
	//用户注销方法
	public String Logout() throws Exception{
		session.remove("users");
		return "logout_success" ;
	}
	
	//用户更改个人信息的功能
	public String ChangeInfo() throws Exception{
		usersdao.update(users);
		return "modifyinfo_success";	
	}
	
	
	Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
}
