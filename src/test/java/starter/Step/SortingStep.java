package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.ProductPage;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingStep {

    ProductPage productPage;

    @Step
    public void capturePriceBeforeSorting(){
        productPage.captureBeforeFilterPrice();
    }

    @Step
    public void capturePriceAfterSorting(){
        productPage.captureAfterFilterPrice();
    }

    @Step
    public void captureNameBeforeSorting(){
        productPage.captureBeforeFilterName();
    }

    @Step
    public void captureNameAfterSorting(){
        productPage.captureAfterFilterName();
    }

    @Step
    public void dropDownPriceLowToHigh(){
        productPage.dropDownFilterPriceLowtoHigh();
    }

    @Step
    public void dropDownPriceHighToLow(){
        productPage.dropDownPriceHighToLow();
    }

    @Step
    public void dropDownNameAtoZ(){
        productPage.dropDownNameAtoZ();
    }

    @Step
    public void dropDownNameZtoA(){
        productPage.dropDownNameZtoA();
    }

    @Step
    public void dropDown(String select){
        if(select.contains("Name")){
            captureNameBeforeSorting();
        } else {
            capturePriceBeforeSorting();
        }
        switch (select){
            case "Name (A to Z)":
                dropDownNameAtoZ();
                break;
            case "Name (Z to A)":
                dropDownNameZtoA();
                break;
            case "Price (low to high)":
                dropDownPriceLowToHigh();
                break;
            case "Price (high to low)":
                dropDownPriceHighToLow();
                break;
            default:
        }
    }

    @Step
    public void resultSorting(String result){
        if (result.contains("name")){
            captureNameAfterSorting();
        } else{
            capturePriceAfterSorting();
        }
        switch (result){
            case "name a to z":
                verifyNameAtoZ();
                break;
            case "name z to a":
                verifyNameZtoA();
                break;
            case "price low to high":
                verifyPriceLowToHigh();
                break;
            case "price high to low":
                verifyPriceHighToLow();
                break;
            default:
        }
    }

    @Step
    public void verifyNameAtoZ(){
        Collections.sort(ProductPage.beforeFilterNproduct);
        assertEquals(ProductPage.afterFilterNproduct, ProductPage.beforeFilterNproduct);
    }

    @Step
    public void verifyNameZtoA(){
        Collections.sort(ProductPage.beforeFilterNproduct, Collections.reverseOrder());
        assertEquals(ProductPage.afterFilterNproduct, ProductPage.beforeFilterNproduct);
    }

    @Step
    public void verifyPriceHighToLow(){
        Collections.sort(ProductPage.beforeFilterPriceList, Collections.reverseOrder());
        assertEquals(ProductPage.afterFilterPriceList, ProductPage.beforeFilterPriceList);
    }

    @Step
    public void verifyPriceLowToHigh(){
        Collections.sort(ProductPage.beforeFilterPriceList);
        assertEquals(ProductPage.afterFilterPriceList, ProductPage.beforeFilterPriceList);
    }
}
