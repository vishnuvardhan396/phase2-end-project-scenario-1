Feature: Test StartHealth webpage using cucumber

  Scenario Outline: Validate the Star Health Buy Now flow
    Given User launches the Star Health application with '<URL>'
    And User get home page title and Validates it
    And User clicks on the Buy Now button
    Then User Enters data for  '<FullName>','<PhNo>','<email>','<PIN>'
    And User click on getstarted button
    Then User select the checkbox for myself
    Then user navigates to the HomePage with '<URL>'
 

    Examples: 
      | URL                        | FullName | PhNo       | email           | PIN    |
      | https://www.starhealth.in/ | vishnu    | 9090890978 | vishnu@gmail.com | 524230 |