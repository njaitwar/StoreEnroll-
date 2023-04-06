package com.zoho.service;

import java.util.List;

import com.zoho.entities.Contacts;

public interface ContactService {
	
	public void saveOneContact(Contacts contact);
	
	public List<Contacts> listAllContacts();
	
	public Contacts findContactById(long id);

}
