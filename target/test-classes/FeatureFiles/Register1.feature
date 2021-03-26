Feature: Registration Functionality Scenarios
  @Register @One
  Scenario: Verify the user is able to register into the application by providing all the details
    Given I launch the application
    And I navigate to Account registration page
    When I provide all the valid  details
      | FirstName  | Shrey                  |
      | LastName   | Gupta                  |
      | Email      | Shreygupta33@gmail.com |
      | Telephone  | 9810983129             |
      | Password   | testautomation         |
    And I select the privacy policy
    And I click on the continue button
    Then I should see  User account  has been successfully created
    
    
    @Register @Two
    Scenario: Verify user is not allowed to register when user doesnt provides mandatory fields 
    Given I launch the application
    And I navigate to Account registration page
    When I click on the continue button 
    Then I should see the user account is not created 
    And  I should see the erorr messages informing the  user to fill the mandatory fields
    
    @Register @Three
    Scenario: Verify user is allowed to register while opting  for Newsletter subscription 
    Given I launch the application
    And I navigate to Account registration page
    When I provide all the valid  details
      | FirstName  | Shrey                  |
      | LastName   | Gupta                  |
      | Email      | Shreygupta33@gmail.com |
      | Telephone  | 9810983129             |
      | Password   | testautomation         |
    And I select the privacy policy
    When I subscribe the Newsletter
    And  I click on the continue button
    Then I should see  User account  has been successfully created
    
    @Register @Four
    Scenario: Verify a duplicate user is not  allowed to register 
    Given I launch the application
    And I navigate to Account registration page
    When I provide the below duplicate details 
      | FirstName  | Shrey                  |
      | LastName   | Gupta                  |
      | Email      | Shreygupta33@gmail.com |
      | Telephone  | 9810983129             |
      | Password   | testautomation         |
    And I select the privacy policy
    When I subscribe the Newsletter
    And  I click on the continue button
    Then I should see  User is not able to create Duplicate accoun
    
    
    
    
    