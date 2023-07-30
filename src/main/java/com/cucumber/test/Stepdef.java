package com.cucumber.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	@Given("Go to application URL")
	public void go_to_application_url() {
	   //code 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazone.com/");
	}

	@When("click sign in button")
	public void click_sign_in_button() {
	    
	}

	@When("put valid user")
	public void put_valid_user() {
	    
	}

	@When("put valid password")
	public void put_valid_password() {
	   
	}

	@When("click sign in")
	public void click_sign_in() {
	  
	}

	@Then("check sign out button")
	public void check_sign_out_button() {
	    
	}




}
