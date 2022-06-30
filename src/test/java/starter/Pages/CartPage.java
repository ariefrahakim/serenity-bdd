package starter.Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {

    public static List<Double> priceProduct = new ArrayList<>();

    WebElement idProduct;
    WebElement differentIdProduct;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement Checkoutbutton;

    @FindBy(className = "inventory_item_price")
    List<WebElementFacade> priceonCart;

    public Boolean getDisplayedProduct(){
        idProduct = getDriver().findElement(By.xpath("//*[text()=\""+ProductPage.nameProduct+"\"]"));
        return idProduct.isDisplayed();
    }
    public Boolean getDisplayedDifferentProduct(int z){
        differentIdProduct = getDriver().findElement(By.xpath("//*[text()=\""+ProductPage.differentProduct.get(z)+"\"]"));
        return differentIdProduct.isDisplayed();
    }

    public void getPriceCartPage(){
        for (WebElementFacade p : priceonCart){
            priceProduct.add(Double.valueOf(p.getText().replaceAll("\\$", "")));
        }
    }

    public void clickCheckoutButton(){
        Checkoutbutton.click();
    }
}
