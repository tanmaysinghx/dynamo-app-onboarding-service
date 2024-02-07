package com.dynamoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamoapp.model.CompanyDetails;
import com.dynamoapp.service.CompanyDetailsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/company-details")
@CrossOrigin("*")
@Tag(description = "Your API Description", name = "Company Details")
public class CompanyDetailsController {
	
	@Autowired 
	private CompanyDetailsService companyDetailsService;
	
	@Operation(summary = "Api to register company", description = "")
	@PostMapping("/register-company")
	public CompanyDetails registerCompanyDetails(@RequestBody CompanyDetails companyDetails) throws Exception {
		return this.companyDetailsService.registerCompany(companyDetails);
	}
	
	@Operation(summary = "Api to update company data", description = "")
	@PutMapping("/update-company-data/{companyCode}")
	public CompanyDetails updateCompanyDetails(@RequestBody CompanyDetails companyDetails, @PathVariable("companyCode") Long companyCode) throws Exception {
		return this.companyDetailsService.updateData(companyCode, companyDetails);
	}
	
	@Operation(summary = "Api to delete company data", description = "")
	@DeleteMapping("/delete-company-data/{companyCode}")
	public CompanyDetails deleteCompanyDetails(@PathVariable("companyCode") Long companyCode) throws Exception {
		return this.companyDetailsService.deleteCompany(companyCode);
	}
	
	@Operation(summary = "Api to get company data", description = "")
	@GetMapping("/get-company-data/{companyCode}")
	public CompanyDetails getCompanyDetails(@PathVariable("companyCode") Long companyCode) throws Exception {
		return this.companyDetailsService.getCompanyDetails(companyCode);
	}
	
	@Operation(summary = "Api to get all company list", description = "")
	@GetMapping("/get-company-list")
	public List <CompanyDetails> getCompanyList() throws Exception {
		return this.companyDetailsService.getAllCompanies();
	}
	
}
