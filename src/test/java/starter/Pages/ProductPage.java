package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement headerProductPage;

    public String getHeaderProductPage(){
        return headerProductPage.getText();
    }
}
