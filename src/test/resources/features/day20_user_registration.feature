@user_registration @smoke
Feature:  registration feature

  Scenario Outline: user should be able to register

    Given  user is on the registration page
    And user enters ssn number as "<SSN>"
    And user enters firstname as "<firstName>" and lastname as "<lastName>"
    And user provides address "<address>"
    And user provides phoneNumber "<phoneNumber>"
    And user provides username "<username>"
    And user provides email "<email>"
    And user provides username "<username>"
    And user provides the firstPassword as "<firstPassword>" and secondPassword as "<secondPassword>"
    And user click on the register button and see the success message as "<successMessage>"


    Examples:  user info
    |SSN|firstName|lastName|address|phoneNumber|username|email|firstPassword|secondPassword|successMessage|
    |393-45-1278|New User|last|Milky way|456-279-5588|utilisateur|salih34@gmail.com|Utilisateur123.|Utilisateur123.|successfully registered|
