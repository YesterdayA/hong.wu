package com.wh.entity;

//����һ������Ա��
public class Admin {
	private int aid;        //����Ա���
	private String admin;   //����Ա�˺�
	private String password;// ����Ա����
	private String gender;  //����Ա�Ա�
	
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
