package com.dynamoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamoapp.model.CompanyDetails;
import com.dynamoapp.model.GroupDetails;
import com.dynamoapp.service.GroupDetailsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/group-details")
@CrossOrigin("*")
@Tag(description = "Your API Description", name = "Group Details")
public class GroupDetailsController {
	
	@Autowired
	private GroupDetailsService groupDetailsService;
	
	@Operation(summary = "Api to register group", description = "")
	@PostMapping("/register-group/{companyCode}")
	public GroupDetails registerGroupDetails(@RequestBody GroupDetails groupDetails, @PathVariable("companyCode") Long companyCode) throws Exception {
		return this.groupDetailsService.registerGroup(groupDetails, companyCode);
	}
	

}
