package com.dynamoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dynamoapp.model.GroupDetails;


public interface GroupDetailsRepository extends JpaRepository<GroupDetails, Long>{

	public GroupDetails findByGroupCode(Long groupCode);
	
}
