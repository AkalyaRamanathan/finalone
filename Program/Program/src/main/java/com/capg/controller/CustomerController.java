package com.capg.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.bean.Customer;
import com.capg.bean.Merchant;



@RestController
public class CustomerController {
	@RequestMapping("/customer")
	public Customer getProduct(@RequestParam String id,@RequestParam String password,String userName, int age, String phonenumber, String address, String gender, String repeatpassword) {
		RestTemplate rt=new RestTemplate();
		Customer c=rt.getForObject("http://localhost:4441/savecustomers?id="+id+"&password="+password+"&userName="+userName+"&age="+age+"&phonenumber="+phonenumber+"&address="+address+"&gender="+gender, Customer.class);
		
		return c;
	
}
	@RequestMapping("/merchant")
    public Merchant getMerchant(@RequestParam String id,@RequestParam String password ,@RequestParam String merchantName,@RequestParam String phoneNumber,@RequestParam String address,@RequestParam String gender,
			@RequestParam	String productType) {
    RestTemplate rt1=new RestTemplate();
	Merchant m=rt1.getForObject("http://localhost:4441/savemerchant?id="+id+"&password="+password+"&merchantName="+merchantName+"&phoneNumber="+phoneNumber+"&address="+address+"&gender="+gender+"&productType="+productType, Merchant.class);
	return m;

	}
}