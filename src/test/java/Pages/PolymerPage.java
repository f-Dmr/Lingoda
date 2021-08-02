package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolymerPage {

    @FindBy(css = "[id='new-todo']")
    public WebElement firstItem;

    @FindBy(xpath = "(//label[@class='style-scope td-item'])[2]")
    public WebElement secondItem;

    @FindBy(id = "edit")
    public WebElement editItem;

    public PolymerPage(){
        PageFactory.initElements(Driver.getdriver(),this);
    }


}
