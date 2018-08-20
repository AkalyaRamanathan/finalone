package com.capg.service;

import java.util.Optional;

import com.capg.bean.Customer;



public interface CustomerService {
	

	
	public void saveCustomer(String id,String password,String userName, int age, String phonenumber, String address, String gender);

}
