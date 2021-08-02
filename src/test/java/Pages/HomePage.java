package Pages;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(css = "[role='tab']")
    public List<WebElement> titles;

    @FindBy(xpath = "//a[contains(text(),'Polymer')]")
    public WebElement polymer;


    public void titleExamples(String title) {
        for (WebElement webElement : titles) {

            if (webElement.getText().equals(title)){
                webElement.click();
                BrowserUtils.waitFor(2);
            }
        }
    }

    public HomePage(){
        PageFactory.initElements(Driver.getdriver(),this);
    }

}
