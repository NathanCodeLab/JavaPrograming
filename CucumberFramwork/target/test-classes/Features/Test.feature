@Login
Feature: Login Page and Logged in Function testing
  I want to Login using crediantals and Validate dashboard page

  @LoginPageValidation
  Scenario: Login page validation
    Given I want to open the browser
    When browser open enter the URL
    And validate the login page Title "sabarinathan"
    And get the currentURL
    Then Finding the element for all the fields


   @AfterLoginPage
   Scenario: Dashboard Page Titl validation
   	Given I want to validate the title
   	When I want to get the currentURL
   	Then I want to quit the browser
   	
   	@LoginCredentials
  Scenario Outline: Loging in Using username and password
    Given I want to enter the username <"username">
    When I want to enter the password <"password" >
    Then I want to click the login button
    
    
    Examples:
    |username|password|
    |admin|admin123|
    |Admin|Admin123|
    |admin|Admin123|
   	|Admin|admin123|
   	
   	
   		