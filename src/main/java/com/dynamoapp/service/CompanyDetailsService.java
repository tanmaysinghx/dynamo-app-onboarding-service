package com.dynamoapp.service;

import java.util.List;

import com.dynamoapp.model.CompanyDetails;

public interface CompanyDetailsService {
	
	/* Register a new company */
	public CompanyDetails registerCompany(CompanyDetails companyDetails) throws Exception;
	
	/* Update data for a company */
	public CompanyDetails updateData(Long companyCode, CompanyDetails companyDetails);
	
	/* Delete company */
	public CompanyDetails deleteCompany(Long companyCode);
	
	/* Get company details */
	public CompanyDetails getCompanyDetails(Long companyCode);
	
	/* Get all company list */
	public List<CompanyDetails> getAllCompanies();
}
