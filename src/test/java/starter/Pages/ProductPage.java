package starter.Pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

import java.util.List;



@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {

    public static String nameProduct;

    public static ArrayList<String> differentProduct = new ArrayList<>();

    public static List<Double> beforeFilterPriceList = new ArrayList<>();

    public static List<Double> afterFilterPriceList = new ArrayList<>();

    public static List<String> beforeFilterNproduct = new ArrayList();

    public static List<String> afterFilterNproduct = new ArrayList();

    WebElement productId;

    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement headerProductPage;

    @FindBy(className = "inventory_item_price")
    List<WebElementFacade> beforeFilterPrice;

    @FindBy(className = "inventory_item_price")
    List<WebElementFacade> afterFilterPrice;

    @FindBy(className = "product_sort_container")
    WebElementFacade ddownSort;

    @FindBy(className = "inventory_item_name")
    List<WebElementFacade> beforeFilterName;

    @FindBy(className = "inventory_item_name")
    List<WebElementFacade> afterFilterName;

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

    public void captureBeforeFilterPrice(){
        for(WebElementFacade p : beforeFilterPrice){
            beforeFilterPriceList.add(Double.valueOf(p.getText().replaceAll("\\$", "")));
        }
    }

    public void dropDownFilterPriceLowtoHigh(){
        ddownSort.selectByVisibleText("Price (low to high)");
    }

    public void dropDownPriceHighToLow(){
        ddownSort.selectByVisibleText("Price (high to low)");
    }

    public void dropDownNameAtoZ(){
        ddownSort.selectByVisibleText("Name (A to Z)");
    }

    public void dropDownNameZtoA(){
        ddownSort.selectByVisibleText("Name (Z to A)");
    }

    public void captureAfterFilterPrice(){
        for(WebElementFacade p : afterFilterPrice){
            afterFilterPriceList.add(Double.valueOf(p.getText().replaceAll("\\$", "")));
        }
    }

    public void captureBeforeFilterName(){
        for (WebElementFacade p : beforeFilterName){
            beforeFilterNproduct.add(p.getText());
        }
    }

    public void captureAfterFilterName(){
        for (WebElementFacade p : afterFilterName){
            afterFilterNproduct.add(p.getText());
        }
    }
}
