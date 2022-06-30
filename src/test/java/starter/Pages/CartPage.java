package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {
    WebElement idProduct;
    WebElement differentIdProduct;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement Checkoutbutton;

    public Boolean getDisplayedProduct(){
        idProduct = getDriver().findElement(By.xpath("//*[text()=\""+ProductPage.nameProduct+"\"]"));
        return idProduct.isDisplayed();
    }
    public Boolean getDisplayedDifferentProduct(int z){
        differentIdProduct = getDriver().findElement(By.xpath("//*[text()=\""+ProductPage.differentProduct.get(z)+"\"]"));
        return differentIdProduct.isDisplayed();
    }

    public void clickCheckoutButton(){
        Checkoutbutton.click();
    }
}
