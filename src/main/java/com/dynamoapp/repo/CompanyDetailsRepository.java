package com.dynamoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dynamoapp.model.CompanyDetails;

public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Long> {

	public CompanyDetails findByCompanyCode(Long companyCode);
	
}
