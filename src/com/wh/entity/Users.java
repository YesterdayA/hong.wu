package com.wh.entity;

//����һ���û���
public class Users {

	private int uid;  //�û����
	private String username;  //�û���
	private String password;  //�û�����
	private String truename;  //��������
	private String email;     //����
	private String phone;     //�绰����
	private String gender;    // �û��Ա�
	private String birthday;  //��������
	private String address;   //�û���ַ
	
	public Users(){
		
	}
	public Users(int uid, String username, String password, String truename,
			String email, String phone, String gender, String birthday,
			String address) {
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.truename = truename;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public String getTruename() {
		return truename;
	}
	public void setTruename(String trueName) {
		this.truename = trueName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
