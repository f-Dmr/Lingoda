Feature: Add Todo Items and Edit

  Background:
    Given User should load to website
    When User should click within the "JavaScript" tab
    And User should select Polymer link
    And the title of the page should be "Polymer • TodoMVC"

  @wip
  Scenario: User should be able to add todo items
    And User should add two todo items
    Then User should be able to edit second item
