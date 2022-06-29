package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {

    public static String nameProduct;

    public static ArrayList<String> differentProduct = new ArrayList<>();

    WebElement productId;

    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement headerProductPage;

    public String getHeaderProductPage(){
        return headerProductPage.getText();
    }

    public void clickProduct(String name){
        nameProduct = name;
        productId = getDriver().findElement(By.xpath("//*[ text() = \""+name+"\"]"));
        productId.click();
    }

    public void verifyCartButton(String name){
        nameProduct = name;
        addToCartButton = getDriver().findElement(By.id("add-to-cart-"+name.replaceAll(" ", "-").toLowerCase()));
        addToCartButton.isDisplayed();
    }

    public void AddToCartButton(){
        addToCartButton.click();
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void clickDifferentProduct(String name){
        productId = getDriver().findElement(By.xpath("//*[ text() = \""+name+"\"]"));
        productId.click();
    }

    public void verifyCartButtonDifProduct(String name){
        addToCartButton = getDriver().findElement(By.id("add-to-cart-"+differentProduct.get(differentProduct.size()-1).replaceAll(" ", "-").toLowerCase()));
        addToCartButton.isDisplayed();
    }
}
