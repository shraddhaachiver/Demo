@SmokeTest
Feature: Login to application
Scenario: Verification of Login Function  
Given user on the Login Page
And user enters "email address" with "chitrali.sharma27@gmail.com" 
And user enters "password" with "Inquiry@1234"  
And user click "log in" button
Then user should see "My Account" 
