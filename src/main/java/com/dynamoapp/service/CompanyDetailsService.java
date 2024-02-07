package com.dynamoapp.service;

import com.dynamoapp.model.CompanyDetails;

public interface CompanyDetailsService {
	
	/* Register a new company */
	public CompanyDetails registerCompany(CompanyDetails companyDetails) throws Exception;
	
	/* Update data for a company */
	public CompanyDetails updateData(String companyCode);
	
	/* Delete company */
	public CompanyDetails deleteCompany(String companyCode);
	
	/* Get company details */
	public CompanyDetails getCompanyDetails(String companyCode);
}
