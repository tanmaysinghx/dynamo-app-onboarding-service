package com.dynamoapp.service;

import com.dynamoapp.model.GroupDetails;

public interface GroupDetailsService {
	
	/* Register a new group */
	public GroupDetails registerGroup(GroupDetails groupDetails, Long companyCode) throws Exception;
	
}
