$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/HomePage.feature");
formatter.feature({
  "name": "Navigate to the Polymer link",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to open polymer page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should load to website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_load_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click within the \"JavaScript\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_click_within_the_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Polymer link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_select_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title of the page should be \"Polymer • TodoMVC\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.the_title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/PolymerPage.feature");
formatter.feature({
  "name": "Add Todo Items and Edit",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should load to website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_load_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click within the \"JavaScript\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_click_within_the_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Polymer link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.user_should_select_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title of the page should be \"Polymer • TodoMVC\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefs.the_title_of_the_page_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to add todo items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User should add two todo items",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.PloymerPageStepDefs.user_should_add_two_todo_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to edit second item",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.PloymerPageStepDefs.user_should_be_able_to_edit_second_item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});