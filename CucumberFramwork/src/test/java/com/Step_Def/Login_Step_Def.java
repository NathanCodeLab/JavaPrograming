package com.Step_Def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Def {

	@Given("I want to open the browser")
	public void i_want_to_open_the_browser() {
		System.out.println("1");
	}

	@When("browser open enter the URL")
	public void browser_open_enter_the_url() {
		System.out.println("2");
	}

	@When("validate the login page Title {string}")
	public void validate_the_login_page_title(String string) {
		System.out.println(string);
	}

	@When("get the currentURL")
	public void get_the_current_url() {
		System.out.println("4");
	}

	@Then("Finding the element for all the fields")
	public void finding_the_element_for_all_the_fields() {
		System.out.println("5");
	}

	@Given("I want to validate the title")
	public void i_want_to_validate_the_title() {
		System.out.println("6");
	}

	@When("I want to get the currentURL")
	public void i_want_to_get_the_current_url() {
		System.out.println("7");
	}

	@Then("I want to quit the browser")
	public void i_want_to_quit_the_browser() {
		System.out.println("8");
	}

	@Given("I want to enter the username <{string}>")
	public void i_want_to_enter_the_username(String string) {
	System.out.println(string);
	}
	

	@When("I want to enter the password <{string} >")
	public void i_want_to_enter_the_password(String string) {
		System.out.println(string);
	}

	@Then("I want to click the login button")
	public void i_want_to_click_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
