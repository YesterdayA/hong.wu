package com.wh.entity;

//定义一个管理员类
public class Admin {
	private int aid;        //管理员编号
	private String admin;   //管理员账号
	private String password;// 管理员密码
	private String gender;  //管理员性别
	
	public Admin(){
		
	}
	
	public Admin(int aid, String admin, String password, String gender) {
		super();
		this.aid = aid;
		this.admin = admin;
		this.password = password;
		this.gender = gender;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
