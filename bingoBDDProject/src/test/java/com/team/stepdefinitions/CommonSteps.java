package com.team.stepdefinitions;

import com.team.app.Login;
import com.team.utils.DependencyUtil;

import io.cucumber.java.en.Given;

public class CommonSteps {
	DependencyUtil service;
	
	public CommonSteps(DependencyUtil service) {
		this.service = service;
	}
	
	String username = "Bala";
	String password = "Bala1";
	
	String new_username = "Akshita";
	String new_password = "Akshita";
	Login login;

	@Given("I have singed into Prime")
	public void i_have_signed_into_prime() {
		//scenario.write(Given I have signed into Prime...");
		login = new Login(username, password);
		System.out.println("Signed in as.." + login.getUsername()+ "//" + login.getPassword());
		login.setUsername(new_username);
		login.setPassword(new_password);
		System.out.println("New log in credentials...."+ login.getUsername()+ "//" + login.getPassword());
	}
}
