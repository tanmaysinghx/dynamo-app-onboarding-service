package com.dynamoapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dynamoapp.model.GroupDetails;
import com.dynamoapp.repo.GroupDetailsRepository;
import com.dynamoapp.service.GroupDetailsService;

@Service
public class GroupDetailsServiceImpl implements GroupDetailsService{
	
	@Autowired
	private GroupDetailsRepository groupDetailsRepository;
	
	@Override
	public GroupDetails registerGroup(GroupDetails groupDetails, Long companyCode) throws Exception {
		this.groupDetailsRepository.save(groupDetails);
		return groupDetails;
	}
	

}
