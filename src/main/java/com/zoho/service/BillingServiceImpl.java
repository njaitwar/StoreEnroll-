package com.zoho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Billing;
import com.zoho.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void generateInvoice(Billing billing) {
		billRepo.save(billing);
		

	}

}
