# AwsTest
Project that uses Selenium and Cucumber framework to test login and registration page

# Getting Started
These instructions will get you a copy of the project and running on your local machine for testing purposes. 

# Prerequisites
- Download and install Elipse IDE
- Downloadn an install Cucumber.io plugin for eclipse
- You need to change the route of the method setUp() inside the class Utilities. Now we have the following route
  System.setProperty("webdriver.chrome.driver","D:\\Desarrollo\\Tutoriales\\Cucumber\\awstest\\src\\test\\resources\\chromedriver.exe");
- You need to chage the route of the chrodirver.exe, depending where you have your workspace.

# Running the tests

The only thing you need to do, is run the login.feature file and/or the registration.feature file. 
You will see the following output

## for login.feature test

Feature: Login to aws site
  Login to asw.amazon.com site with user credentials

  Scenario Outline: Login with valid credentials # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/login/login.feature:7
    Given The user is on the login page
    When The user fills in account id with "<username>"
    And The user press next button
    Then The users should be on the user home page
    And The users sees "<message>"

  Scenario Outline: Login with valid credentials                   # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/login/login.feature:16
    Given The user is on the login page                            # StepsDefinitions.the_user_is_on_the_login_page()
    When The user fills in account id with "jrodriguezc@gmail.com" # StepsDefinitions.the_user_fills_in_with(String)
    And The user press next button                                 # StepsDefinitions.the_user_press_next_button()
    Then The users should be on the user home page                 # StepsDefinitions.the_users_should_be_on_the_user_home_page()
    And The users sees "Login Succesful!"                          # StepsDefinitions.the_users_sees(String)

  Scenario Outline: Login with valid credentials             # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/login/login.feature:17
    Given The user is on the login page                      # StepsDefinitions.the_user_is_on_the_login_page()
    When The user fills in account id with "prueba@test.com" # StepsDefinitions.the_user_fills_in_with(String)
    And The user press next button                           # StepsDefinitions.the_user_press_next_button()
    Then The users should be on the user home page           # StepsDefinitions.the_users_should_be_on_the_user_home_page()
    And The users sees "Invalid Credentials!"                # StepsDefinitions.the_users_sees(String)

2 Scenarios (2 passed)
10 Steps (10 passed)
2m59,719s

## for registration.feature test

Feature: Validate the create new user form
  I want to validate the creation form

  Scenario Outline: Verify is a correct email form # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:7
    Given I am on the registration form
    When I fill the email field with "<email>"
    Then I get the following message "<message>"

  Scenario Outline: Verify is a correct email form           # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:14
    Given I am on the registration form                      # StepsDefinitions.i_am_on_the_registration_form()
    When I fill the email field with "jrodriguezc@gmail.com" # StepsDefinitions.i_fill_the_email_field_with(String)
    Then I get the following message "Valid email!"          # StepsDefinitions.i_get_the_following_message(String)

  Scenario Outline: Verify is a correct email form    # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:15
    Given I am on the registration form               # StepsDefinitions.i_am_on_the_registration_form()
    When I fill the email field with "test"           # StepsDefinitions.i_fill_the_email_field_with(String)
    Then I get the following message "Invalid email!" # StepsDefinitions.i_get_the_following_message(String)

  Scenario Outline: Validate if the password matches # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:17
    Given I am on the registration form
    When I fill the password field with "<password>" and "<repassword>"
    Then I get the following password message "<valid>"

  Scenario Outline: Validate if the password matches      # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:24
    Given I am on the registration form                   # StepsDefinitions.i_am_on_the_registration_form()
    When I fill the password field with "pass" and "pass" # StepsDefinitions.i_fill_the_password_field(String,String)
    Then I get the following password message "Matches"   # StepsDefinitions.i_get_following_password_message(String)

  Scenario Outline: Validate if the password matches    # /D:/Desarrollo/Tutoriales/Cucumber/awstest/src/test/resources/awstest/registration/registration.feature:25
    Given I am on the registration form                 # StepsDefinitions.i_am_on_the_registration_form()
    When I fill the password field with "aaa" and "bbb" # StepsDefinitions.i_fill_the_password_field(String,String)
    Then I get the following password message "Nope"    # StepsDefinitions.i_get_following_password_message(String)

4 Scenarios (4 passed)
12 Steps (12 passed)
4m56,890s

# Versioning
1.0

# Authors
Julian Rodriguez - jurodca <jrodriguezc@gmail.com>

