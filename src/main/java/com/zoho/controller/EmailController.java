package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/compose" , method = RequestMethod.POST)
	public String composeEmail(@RequestParam("email") String email , Model model) {
		model.addAttribute("email", email);
		return "compose";
		}
	//		http://localhost:8080/create
	
	@RequestMapping(value = "/sendEmail",method = RequestMethod.POST)
	public String sendEmail(@RequestParam("to")String to ,@RequestParam("subject")String subject, @RequestParam("message")String message ,Model model) {
		emailService.sendEmail(to, subject, message);
		model.addAttribute("msg", "Email Is Sent!!");
		return "compose";
	}
	
	
	
}
	
