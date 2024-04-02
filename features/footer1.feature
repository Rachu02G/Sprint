Feature: Scroll to footer on homepage
 
  
  Scenario: Navigate to about us in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on about us link
    Then user should be redirected to about us page
    And user get the title of the page

 
  Scenario: Navigate to investor relations in homepage
    Given when user is in redbus homepage

    When user click on investor relations  link
    Then user should be redirected to investor page
    And user get the content of the table from investor page

  Scenario: Navigate to contact us in homepage
    Given when user is in redbus homepage
   # When user scroll to footer scetion 
    And user click on contact us  link
    Then user should be redirected to contact us page
    And user get the Corporate Head Office list

  Scenario: Navigate to values in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on values link
    Then user should be redirected to values  page
    And user get the heading from the page

  Scenario: Navigate to careers in homepage
    Given when user is in redbus homepage
    When user scroll to footer scetion 
    And user click on careers link
    Then user should be redirected to careers page
    And user apply for the web automation role
 
 