package com.dynamoapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynamoapp.model.CompanyDetails;
import com.dynamoapp.repo.CompanyDetailsRepository;
import com.dynamoapp.service.CompanyDetailsService;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {

	@Autowired
	private CompanyDetailsRepository companyDetailsRepository;

	@Override
	public CompanyDetails registerCompany(CompanyDetails companyDetails) throws Exception {
		this.companyDetailsRepository.save(companyDetails);
		return companyDetails;
	}

	@Override
	public CompanyDetails updateData(String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyDetails deleteCompany(String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyDetails getCompanyDetails(String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
