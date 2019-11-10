#Author: jrodriguezc@gmail.com
#Test for Cafeto Software
#Date: 2019/11/05
Feature: Login to aws site
  Login to aws.amazon.com site with user credentials

  Scenario Outline: Login with valid credentials
    Given The user is on the login page
    When The user fills in account id with "<username>"
    And The user press next button
    Then The users should be on the user home page
    And The users sees "<message>"

    Examples: 
      | username              | message              |
      | jrodriguezc@gmail.com | Login Succesful!     |
      | prueba@test.com       | Invalid Credentials! |
