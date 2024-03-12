package com.dynamoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dynamoapp.model.UserDetails;
import java.util.List;


public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
	
	public UserDetails findByUsername(String username);

}
