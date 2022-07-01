package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement headerComplete;

    public Boolean headerDisplayed(){
        return headerComplete.isDisplayed();
    }
}
