package com.dynamoapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.dynamoapp.model.CompanyDetails;
import com.dynamoapp.repo.CompanyDetailsRepository;
import com.dynamoapp.service.CompanyDetailsService;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {

	@Autowired
	private CompanyDetailsRepository companyDetailsRepository;

	/* Method to register new company */
	@Override
	public CompanyDetails registerCompany(CompanyDetails companyDetails) throws Exception {
		this.companyDetailsRepository.save(companyDetails);
		return companyDetails;
	}

	/* Method to update details */
	@Override
	public CompanyDetails updateData(Long companyCode, CompanyDetails updatedDetails) {
		CompanyDetails existingDetails = companyDetailsRepository.findByCompanyCode(companyCode);
		if (existingDetails == null) {
			String errorMessage = "Company with code " + companyCode + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMessage);
		} else if (existingDetails != null) {
			existingDetails.setCompanyName(updatedDetails.getCompanyName());
			existingDetails.setPackageCode(updatedDetails.getPackageCode());
			existingDetails.setSuperuserName(updatedDetails.getSuperuserName());
			existingDetails.setSuperuserEmail(updatedDetails.getSuperuserEmail());
			existingDetails.setStartDate(updatedDetails.getStartDate());
			existingDetails.setEndDate(updatedDetails.getEndDate());

			companyDetailsRepository.save(existingDetails);
			return existingDetails;
		}
		return existingDetails;
	}

	/* Method to delete details */
	@Override
	public CompanyDetails deleteCompany(Long companyCode) {
		CompanyDetails existingDetails = companyDetailsRepository.findByCompanyCode(companyCode);
		if (existingDetails == null) {
			String errorMessage = "Company with code " + companyCode + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMessage);
		} else if (existingDetails != null) {
			companyDetailsRepository.delete(existingDetails);
			throw new ResponseStatusException(HttpStatus.ACCEPTED);
		}
		return existingDetails;
	}

	/* Method to get details */
	@Override
	public CompanyDetails getCompanyDetails(Long companyCode) {
		CompanyDetails existingDetails = companyDetailsRepository.findByCompanyCode(companyCode);
		if (existingDetails == null) {
			String errorMessage = "Company with code " + companyCode + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMessage);
		} else if (existingDetails != null) {
			return existingDetails;
		}
		return existingDetails;
	}

	/* Method to get all company list  */
	@Override
	public List<CompanyDetails> getAllCompanies() {
		return companyDetailsRepository.findAll();
	}

}
