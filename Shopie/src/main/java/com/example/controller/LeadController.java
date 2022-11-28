package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Lead;
import com.example.service.LeadService;

@RestController
@RequestMapping(path="/leads")
public class LeadController {
	
	@Autowired
	LeadService leadService;
	
	@CrossOrigin
	
		
	

	@GetMapping(path="/all")
	public String getLeads() {
		return "signin";
	}
}
