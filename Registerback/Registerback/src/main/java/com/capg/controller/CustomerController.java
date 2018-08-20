package com.capg.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.capg.service.CustomerService;
import com.capg.service.MerchantService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	@Autowired
	MerchantService service1;

	@RequestMapping(value="/savecustomers{id}{password}{userName}{age}{phonenumber}{address}{gender}{repeatpassword}")
	public void saveCustomer(@RequestParam String id,@RequestParam String password,@RequestParam String userName,@RequestParam int age,@RequestParam String phonenumber,@RequestParam  String address,@RequestParam  String gender){
	service.saveCustomer(id,password,userName,age,phonenumber,address,gender);	 
	System.out.println("Registered Successfully");
		 	 }
	
	@RequestMapping(value="/savemerchant{id}{password}{merchantName}{phoneNumber}{address}{gender}{producttype}")
	public void saveMerchant(@RequestParam String id,@RequestParam String password,@RequestParam String merchantName,@RequestParam String phoneNumber,@RequestParam String address,@RequestParam String gender,
			@RequestParam	String productType){
	service1.saveMerchant(id,password,merchantName,phoneNumber,address,gender,productType);	 
	System.out.println("Registered Successfully");
		 	 }

		 	 }


	