**GENERAL INFORMATION:**

**Task:** todomvc web application automation task <br />
**Name:** Fatih Demir (fdemirwork@gmail.com) <br />
**Language:** Java <br />
**Installation Guide:** This is a Maven project that host runs this code Java and Maven is already installed and JAVA_HOME already set. All dependencies in my pom.xml file come from Maven repository which means additional installation is needed.<br />
**Dependencies:** -Junit -Bonigarcia WebDriver -Selenium -Cucumber <br />
**Plugins:** maven-surfire-plugin, CukesRunner, maven-cucumber-reporting <br />
<br />Framework can be created by using TestNG or Cucumber BDD, I preferred Cucumber BDD.
The project is built by using Page Object Model(POM) desing pattern but it can improve if case of need. So that locators/methods are in the related Pages (HomePage & PolymerPage).<br />
<br />For reporting I used Maven Plugin in pom.xml file. I have Cucumber and Default HTML reporting with browser<br />
<br />Gherkin language is used.<br />
<br />

<br />**PAGES AND CLASSES IN THE FRAMEWORK:**

**Pages:** Page object class (HomePage & PolymerPage).<br />
**CukesRunner:** Creates connection between HomePage.feature & PolymerPage.feature files and step definitions.<br />
**Hooks Class:** Runs Before and After scenarios.<br />
**StepDefinitions:** Step definitions class includes our Java codes.<br />
**BrowserUtils:** Screenshots, browser operations, synchronization and other ready Selenium methods.<br />
**Configuration Reader:** Reads configuration.properties file.<br />
**Driver:** Provides WebDriver factory which has browser drivers.<br />
**Feature file:** Test Scenarios are here. Written in Gherkin language.<br />
**Configuration Properties:** Works in key&value structure.<br />
**pom.xml:** Includes necessary dependencies and plugins.
