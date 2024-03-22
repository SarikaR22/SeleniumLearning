Feature: Google Search
  As a user
  I want to be able to search on Google
  So that I can find relevant information

 Scenario Outline: Searching on Google with Parameterization
    Given I am on the Google search page
    When I search for "<search keyword>"
    Then I should see search results for "<title>"

    Examples:
    | search keyword  | title                    |
    | Java            | Java - Google Search     |
    | TestNg          | TestNg - Google Search   |
    | Cucumber        | Cucumber - Google Search |