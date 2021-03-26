Feature: Login Functionality Scenarios 


@Login @One
 Scenario: Verify whether the User is able to login with valid credentials
    Given I launch the application
    And I navigate to Account  Login Page 
    And   I login to the application using Username as "shreygupta33@gmail.com" and Password as "testautomation"
    Then I should see that the user is able to Login successfully
    
    

@Login @Two
 Scenario: Verify whether the User is not able to login with invalid credentials    
 Given I launch the application
    And I navigate to Account  Login Page 
    And   I login to the application using Username as "shreygupta333@gmail.com" and Password as "testautomation"
    Then I should see that Credentials are invalid 
    
    
    
  
@Login @Three
 Scenario: Verify whether the User is not able to login not credentials    
 Given I launch the application
    And I navigate to Account  Login Page 
    And   I login to the application using Username as "" and Password as ""
    Then I should see that Credentials are invalid
    
    
    
 
@Login @Four
 Scenario: Verify whether the User is able to reset Password
 Given I launch the application
    And I navigate to Account  Login Page 
 		When I reset the  forgotten password
    Then I see the Email has been sent to users email to reset password   