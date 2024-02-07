package com.dynamoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamoapp.model.CompanyDetails;
import com.dynamoapp.service.CompanyDetailsService;

@RestController
@RequestMapping("/company-details")
@CrossOrigin("*")
public class CompanyDetailsController {
	
	@Autowired 
	private CompanyDetailsService companyDetailsService;
	
	@PostMapping("/register-company")
	public CompanyDetails registerCompanyDetails(@RequestBody CompanyDetails companyDetails) throws Exception {
		return this.companyDetailsService.registerCompany(companyDetails);
	}
	
}
