package StepDefinitions;

import Pages.PolymerPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PloymerPageStepDefs {
    PolymerPage polymerPage = new PolymerPage();
    Actions actions = new Actions(Driver.getdriver());

    @Then("User should add two todo items")
    public void user_should_add_two_todo_items() {

        BrowserUtils.waitFor(2);
        polymerPage.firstItem.sendKeys(ConfigurationReader.get("toDo1"));

        actions.sendKeys(Keys.ENTER).perform();

        BrowserUtils.waitFor(2);

        polymerPage.firstItem.sendKeys(ConfigurationReader.get("toDo2"));
        actions.sendKeys(Keys.ENTER).perform();

        BrowserUtils.waitFor(2);


    }

    @Then("User should be able to edit second item")
    public void user_should_be_able_to_edit_second_item() {

        actions.doubleClick(polymerPage.secondItem).perform();
        BrowserUtils.waitFor(2);
        actions.doubleClick(polymerPage.editItem).perform();
        BrowserUtils.waitFor(2);
        polymerPage.editItem.sendKeys(Keys.BACK_SPACE);
        BrowserUtils.waitFor(2);
        polymerPage.editItem.sendKeys(ConfigurationReader.get("edittedItem"),Keys.ENTER);
        BrowserUtils.waitFor(2);

    }
}
