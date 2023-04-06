package com.zoho.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.service.ContactService;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	// 			http://localhost:8080/create
	@RequestMapping(value = "/create" , method = RequestMethod.GET)
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	// 			http://localhost:8080/create
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead") Lead lead , Model model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("msg", "Lead Is Saved!!");
		return "lead_info";
	}
	@RequestMapping("/listleads")  // http://localhost:8080/listleads
	public String listleads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id , Model model) {
		Lead lead = leadService.findLeadById( id);
		model.addAttribute("lead", lead);
		return "lead_info";
		}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id , Model model) {
		Lead lead = leadService.findLeadById(id);
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveOneContact(contact);
		
		leadService.deleteById(id);
		List<Contacts> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	
	}
	
}
