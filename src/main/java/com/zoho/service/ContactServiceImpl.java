package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contacts;
import com.zoho.repositories.ContactsRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactsRepository contactRepo;

	@Override
	public void saveOneContact(Contacts contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contacts> listAllContacts() {
		List<Contacts> contact = contactRepo.findAll();
		return contact;
	}
	@Override
	public Contacts findContactById(long id) {
	Optional<Contacts> findById = contactRepo.findById(id);
	Contacts contact = findById.get();
	return contact;

	}

}
