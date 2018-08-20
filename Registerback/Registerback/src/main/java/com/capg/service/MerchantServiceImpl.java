package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.bean.Merchant;
import com.capg.repo.CustomerRepo;
import com.capg.repo.MerchantRepo;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantRepo repo1;
	@Override
	public void saveMerchant(String id, String password,String merchantName, String phoneNumber, String address, String gender,
			String productType) {
		// TODO Auto-generated method stub
	

	
			// TODO Auto-generated method stub
			Merchant m=new Merchant();
			m.setId(id);
			m.setPassword(password);
			m.setMerchantName(merchantName);
			m.setPhoneNumber(phoneNumber);
			m.setAddress(address);
			m.setGender("Male");
			m.setGender("Female");
			m.setProductType(productType);
			repo1.save(m);
		
	}

}
