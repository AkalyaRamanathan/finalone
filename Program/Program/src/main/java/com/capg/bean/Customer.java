package com.capg.bean;



public class Customer {



private String id;
private String userName;
private int age;
private String phonenumber;
private String address;
private String gender;
private String password;
private String repeatpassword;


public Customer(String id, String userName, int age, String phonenumber, String address, String gender, String password,
		String repeatpassword) {
	super();
	this.id = id;
	this.userName = userName;
	this.age = age;
	this.phonenumber = phonenumber;
	this.address = address;
	this.gender = gender;
	this.password = password;
	this.repeatpassword = repeatpassword;
}


@Override
public String toString() {
	return "Customer [id=" + id + ", userName=" + userName + ", age=" + age + ", phonenumber=" + phonenumber
			+ ", address=" + address + ", gender=" + gender + ", password=" + password + ", repeatpassword="
			+ repeatpassword + "]";
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getRepeatpassword() {
	return repeatpassword;
}


public void setRepeatpassword(String repeatpassword) {
	this.repeatpassword = repeatpassword;
}


public Customer() {
	
}





}
