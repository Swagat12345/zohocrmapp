package com.com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.com.zohocrm.entities.Contact;
import com.com.zohocrm.services.ContactService;

@Controller
public class ContactController {

	private ContactService contactService;
	
	
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}



	@RequestMapping("/listallcontacts")
	public String listAllLeads(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return"list_contacts";
	}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id, Model model) {
		
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		
		return "contact_info";
	}
}
