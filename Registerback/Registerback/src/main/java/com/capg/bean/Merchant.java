package com.capg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Merchant {
	
	@Id
	private String id;
	@Column(name="merchantName")
	private String merchantName;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="address")
	private String address;
	@Column(name="gender")
	private String gender;
	@Column(name="producttype")
	private String productType;
	@Column(name="password")
	private String password;
	
	public Merchant(String id, String merchantName, String phoneNumber, String address, String gender,
			String productType, String password, String repeatPassword) {
		super();
		this.id = id;
		this.merchantName = merchantName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.productType = productType;
		this.password = password;
		
	}
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", merchantName=" + merchantName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", gender=" + gender + ", productType=" + productType + ", password=" + password
				+ " ]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Merchant() {
		
	}

}
