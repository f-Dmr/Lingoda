
  Feature: Navigate to the Polymer link
    @wip
    Scenario: User should be able to open polymer page
      Given User should load to website
      When User should click within the "JavaScript" tab
      And User should select Polymer link
      Then the title of the page should be "Polymer • TodoMVC"

