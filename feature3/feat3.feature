
Feature: login and add to cart

@smoke
  Scenario Outline: login fuctions
    Given Enter user name '<username>'
    And Enter the password '<password>'
    Then click on login button

Examples: 
|username|password|
|lalitha|Password123|
@sanity
Scenario: The one where the users move to cart without adding any item in it
  Given Alex has registered in to TestMeApp
  When Alex search a particular product like headphones
  And Try to proceed to payment without adding any item in the cart
  Then TestMeApp doesn't display the cart icon
  
@smack

Scenario: Registeration process
Given open the web browser and click on sign in
And enter the username "AlexUser"
And enter the first name "Alex"
And enter the last name "User"
And enter the password "Alex@123"
And enter the confirm password "Alex@123"
And click on gender"male"
And enter the email "Alex@gmail.com"
And enter the mobile number "9876543210"
And click on DOB "09/11/2000"
And enter the address "22,Waverock,Gachibowli,Hyderbad"
And Select the Security question "What is your favour color"
And enter the answer "purple"
Then click on register