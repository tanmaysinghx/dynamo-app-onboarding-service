package com.dynamoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String useraccess;
    private String packagecode;
	private boolean enabled = true;
	
	public UserDetails() {
		super();
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUseraccess() {
		return useraccess;
	}

	public void setUseraccess(String useraccess) {
		this.useraccess = useraccess;
	}

	public String getPackagecode() {
		return packagecode;
	}

	public void setPackagecode(String packagecode) {
		this.packagecode = packagecode;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserDetails(Long userid, String username, String firstName, String lastName, String email,
			String phone, String useraccess, String packagecode, boolean enabled) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.useraccess = useraccess;
		this.packagecode = packagecode;
		this.enabled = enabled;
	}
	
	
}
