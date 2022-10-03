package com.api.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.contact.entity.Contact;
import com.api.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/status")
	public String getStatus() {
		return "Contact service is up and running";
	}
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return this.contactService.getContactOfUser(userId);
    }
}
