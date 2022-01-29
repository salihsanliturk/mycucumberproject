#All feature files must start with Feature keyword. There can be ONLY1 Feature keyword
#Feature describes the overall test cases.
Feature: Google_Search_Functionality
 #Scenario = Test Case
 #Under Scenario, we will have TEST STEPS
  #Given, And, Then, When, But, * annotations
  #These are Gherkin language
  #EACH STEP MUST START WITH A GHERKEN KEYWORD

  Scenario: TC01_iphone_search
    Given user is on the google page