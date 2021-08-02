package StepDefinitions;

import Pages.HomePage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();


    @Given("User should load to website")
    public void user_should_load_to_website() {
        Driver.getdriver().get(ConfigurationReader.get("url"));
    }

    @When("User should click within the {string} tab")
    public void user_should_click_within_the_tab(String title) {
        homePage.titleExamples(title);
    }

    @When("User should select Polymer link")
    public void user_should_select_link() {
        homePage.polymer.click();
    }

    @Then("the title of the page should be {string}")
    public void the_title_of_the_page_should_be(String expectedPageTitle) {
        String actualPageTitle=Driver.getdriver().getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }
}


