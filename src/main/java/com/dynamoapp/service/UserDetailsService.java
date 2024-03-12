package com.dynamoapp.service;

import com.dynamoapp.model.UserDetails;

public interface UserDetailsService {
	
	/* Sync data from SSO */
	public UserDetails syncData(UserDetails userDetails) throws Exception;
	
	/* Register user on dynamo app - Future scope */
	public UserDetails registerUser(UserDetails userDetails) throws Exception;
	
	/* Get user information */
	public UserDetails getUserData(String username);
	
	/* Sync Done */
	public Boolean dataSyncCheck(String username);
}
