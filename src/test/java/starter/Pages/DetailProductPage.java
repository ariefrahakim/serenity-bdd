package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailProductPage extends PageObject {

    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")
    WebElement nameDetail;

    @FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")
    WebElement descProduct;

    @FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")
    WebElement priceProduct;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartPage;


    WebElement removeButton;

    public String getNameDetailProduct(){
        return nameDetail.getText();
    }

    public String getDescription(){
        return descProduct.getText();
    }

    public String getPrice(){
        return priceProduct.getText();
    }

    public Boolean verifyAddToCart(){
        addToCartButton = getDriver().findElement(By.id("add-to-cart-"+ProductPage.nameProduct.replaceAll(" ", "-").toLowerCase()));
        return addToCartButton.isDisplayed();
    }

    public Boolean isRemoveButtonAppear(){
        removeButton = getDriver().findElement(By.id("remove-"+ProductPage.nameProduct.replaceAll(" ", "-").toLowerCase()));
        return removeButton.isDisplayed();
    }

    public void clickAddtoCartButton(){
        addToCartButton.click();
    }

    public void clickCartPage(){
        cartPage.click();
    }

    public Boolean verifyDifferentAddToCart(){
        addToCartButton = getDriver().findElement(By.id("add-to-cart-"+ProductPage.differentProduct.get(ProductPage.differentProduct.size()-1).replaceAll(" ", "-").toLowerCase()));
        return addToCartButton.isDisplayed();
    }

    public Boolean verifyDifferentProductRemove(){
        removeButton = getDriver().findElement(By.id("remove-"+ ProductPage.differentProduct.get(ProductPage.differentProduct.size()-1).replaceAll(" ", "-").toLowerCase()));
        return removeButton.isDisplayed();
    }
}
