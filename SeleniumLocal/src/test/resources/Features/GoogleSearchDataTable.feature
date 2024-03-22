Feature: Google Search Data Table
Scenario: Searching on Google with DataTable as List
    Given I am on the Google search page to search multiple data
    When I search for the following set of terms
      | Search Term |
      | Java        |
      | Cucumber    |
      | Selenium    |
    Then I should see search results for each term as expected