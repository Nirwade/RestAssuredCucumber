Feature: Perform the CURD Operations

  Scenario: To Perform the GET Operation on Employe 08
    Given The base URI is "http://localhost:3000/employees"
    When I perform the GET Operation
    Then Responsecode should be

  @Sanity
  Scenario: To Perform the POST Operation on Employe 08
    Given The base URI is "http://localhost:3000/employees"
    When I perform the POST Operation with "name" and "salary"
    Then Responsecode should be

  Scenario: To Perform the PUT Operation on Employe 08
    Given The base URI is "http://localhost:3000/employees"
    When I perform the PUT Operation with 8, "name" and "salary"
    Then Responsecode should be

  @Regression
  Scenario: To Perform the DEL Operation on Employe 08
    Given The base URI is "http://localhost:3000/employees"
    When I perform the DEL Operation with 8
    Then Responsecode should be
