package com.dynamoapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.dynamoapp.model.UserDetails;
import com.dynamoapp.repo.UserDetailsRepository;
import com.dynamoapp.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails syncData(UserDetails userDetails) throws Exception {
		this.userDetailsRepository.save(userDetails);
		return userDetails;
	}

	@Override
	public UserDetails registerUser(UserDetails userDetails) throws Exception {
		this.userDetailsRepository.save(userDetails);
		return userDetails;
	}

	@Override
	public UserDetails getUserData(String username) {
		UserDetails userDetails = this.userDetailsRepository.findByUsername(username);
		if (userDetails == null) {
			String errorMessage = "User with username " + username + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMessage);
		}
		return userDetails;
	}

	@Override
	public Boolean dataSyncCheck(String username) {
		UserDetails userDetails = this.userDetailsRepository.findByUsername(username);
		if (userDetails == null) {
			return false;
		} else {
			return true;
		}
	}

}
