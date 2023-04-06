package com.zoho.service;



import java.util.List;

import com.zoho.entities.Lead;

public interface LeadService {
	
	public void saveLeadInfo(Lead lead);
	
	public List<Lead> getAllLeads();

	public Lead findLeadById(long id);

	public void deleteById(long id);

	
}
