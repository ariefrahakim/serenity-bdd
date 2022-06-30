package starter.StepDefinition;


import io.cucumber.java.After;
import starter.Pages.CartPage;
import starter.Pages.ProductPage;

public class hooks {
    @After
    public void afterScenario(){
        ProductPage.differentProduct.clear();
        ProductPage.beforeFilterPriceList.clear();
        ProductPage.afterFilterPriceList.clear();
        ProductPage.beforeFilterNproduct.clear();
        ProductPage.afterFilterNproduct.clear();
        CartPage.priceProduct.clear();
    }
}