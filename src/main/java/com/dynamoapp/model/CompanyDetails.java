package com.dynamoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "companydetails")
public class CompanyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long companyCode;
	private String companyName;
	private Long packageCode;
	private String superuserName;
	private String superuserEmail;
	private String startDate;
	private String endDate;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Long getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getPackageCode() {
		return packageCode;
	}
	public void setPackageCode(Long packageCode) {
		this.packageCode = packageCode;
	}
	public String getSuperuserName() {
		return superuserName;
	}
	public void setSuperuserName(String superuserName) {
		this.superuserName = superuserName;
	}
	public String getSuperuserEmail() {
		return superuserEmail;
	}
	public void setSuperuserEmail(String superuserEmail) {
		this.superuserEmail = superuserEmail;
	}
	
	public CompanyDetails() {
		
	}
	
	public CompanyDetails(Long companyCode, String companyName, Long packageCode, String superuserName,
			String superuserEmail, String startDate, String endDate) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.packageCode = packageCode;
		this.superuserName = superuserName;
		this.superuserEmail = superuserEmail;
		this.startDate = startDate;
		this.endDate = endDate;
	}

}
