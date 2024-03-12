package com.dynamoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.dynamoapp.model.UserDetails;
import com.dynamoapp.service.UserDetailsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user-details")
@CrossOrigin("*")
@Tag(description = "Your API Description", name = "User Details")
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	@Operation(summary = "Api to sync data from SSO", description = "")
	@PostMapping("/sync-data")
	public UserDetails syncData(@RequestBody UserDetails userDetails) throws Exception {
		return this.userDetailsService.syncData(userDetails);
		/* Need upgrade - call api directly and sync data */
	}

	@Operation(summary = "Api to register user", description = "")
	@PostMapping("/register-user")
	public UserDetails registerUser(@RequestBody UserDetails userDetails) throws Exception {
		return this.userDetailsService.syncData(userDetails);
	}

	@Operation(summary = "Api to get user data", description = "")
	@GetMapping("/get-user-data/{username}")
	public UserDetails getUserData(@PathVariable("username") String username) {
		return this.userDetailsService.getUserData(username);
	}

	@Operation(summary = "Api to check if user exist in DB", description = "")
	@GetMapping("/data-sync-check/{username}")
	public Boolean dataSyncCheck(@PathVariable("username") String username) {
		return this.userDetailsService.dataSyncCheck(username);
	}
}
