package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Contacts;
import com.zoho.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listcontacts") 		// http://localhost:8080/listcontacts
	public String listAllContacts(Model model) {
		List<Contacts> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	@RequestMapping("/contactInfo")
	public String contactsInfo(@RequestParam("id") long id , Model model) {
		Contacts contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "contacts_info";
	}

}
