package com.akash.springboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service  // autowiring with login controller
public class AuthenticationService {
	
	// created authentication service to store the variables only
	public boolean authenticate(String username, String password) {
		boolean userName = username.equalsIgnoreCase("akash");
		boolean userPassword = password.equalsIgnoreCase("demo");
		return userName && userPassword;
	}
}
