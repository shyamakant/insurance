package com.hcl.insuranceApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.insuranceApplication.service.PolicyService;

@RestController
@RequestMapping("/account")
public class InsuranceController {
 
	@Autowired
	private PolicyService payeeService;
	
	
	
}
