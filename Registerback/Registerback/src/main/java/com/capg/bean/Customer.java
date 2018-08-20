package com.capg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Customer {


@Id
private String id;
@Column(name="userName")
private String userName;
@Column(name="age")
private int age;
@Column(name="phonenumber")
private String phonenumber;
@Column(name="address")
private String address;
@Column(name="gender")
private String gender;
private String password;





public Customer(String id, String userName, int age, String phonenumber, String address, String gender, String password
		) {
	super();
	this.id = id;
	this.userName = userName;
	this.age = age;
	this.phonenumber = phonenumber;
	this.address = address;
	this.gender = gender;
	this.password = password;

}




@Override
public String toString() {
	return "Customer [id=" + id + ", userName=" + userName + ", age=" + age + ", phonenumber=" + phonenumber
			+ ", address=" + address + ", gender=" + gender + ", password=" + password + "]";
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












public Customer() {
	
}

}
