#Author: jrodriguezc@gmail.com
#Test for Cafeto Software
#Date: 2019/11/07
Feature: Validate the create new user form
  I want to validate the creation form

  Scenario Outline: Verify is a correct email form
    Given I am on the registration form
    When I fill the email field with "<email>"
    Then I get the following message "<message>"

    Examples: 
      | email                 | message        |
      | jrodriguezc@gmail.com | Valid email!   |
      | test                  | Invalid email! |

  Scenario Outline: Validate if the password matches
    Given I am on the registration form
    When I fill the password field with "<password>" and "<repassword>"
    Then I get the following password message "<valid>"

    Examples: 
      | password | repassword | valid   |
      | pass     | pass       | Matches |
      | aaa      | bbb        | Nope    |
