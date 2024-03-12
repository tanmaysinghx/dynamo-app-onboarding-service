package com.dynamoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "groupdetails")
public class GroupDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long groupCode;
	private String groupName;
	private Long companyCode;
	
	public GroupDetails() {
		super();
	}
	
	public GroupDetails(Long groupCode, String groupName, Long companyCode) {
		super();
		this.groupCode = groupCode;
		this.groupName = groupName;
		this.companyCode = companyCode;
	}

	public Long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}
	
	
}
