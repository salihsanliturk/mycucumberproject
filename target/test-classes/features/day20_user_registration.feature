Feature: User Gives Credentials For Registering

  Scenario Outline: User Register
    Given User is on register page
    And user sends ssn "<ssn>"
    And user sends firstname as "<firstname>" and lastname as "<lastname>"
    And user sends as "<address>"
    And user sends phone numbers as "<phone_number>"
    And user sends as "<username>"
    And user sends as "<email>"
    And user sends as "<new_password>"
    And user sends as second password "<new_password_confirmation>"
    And user clicks register button
    Then user see pop up "<message>"
    Then user close application



    Examples: Register Data
      | ssn       | firstname |lastname | address | phone_number | username   |email         |new_password   | new_password_confirmation | message               |
      |883-05-2002|New User   |last     |Milky way|456-279-5588  |utilisateur78|sth@gmail.com|Utilisateur123.|Utilisateur123.            |successfully registered|