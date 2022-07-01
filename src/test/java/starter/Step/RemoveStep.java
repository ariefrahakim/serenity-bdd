package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CartPage;
import starter.Pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveStep {

    String nameProduct;

    CartPage cartPage;

    @Step
    public void clickRemoveButton(){
        cartPage.clickRemoveButton();
        if (ProductPage.differentProduct.size() != 0){
            for (int i=0; i<ProductPage.differentProduct.size(); i++){
                cartPage.removeDifferentProduct(i);
            }
        }
    }

    @Step
    public void notDisplayedProduct(){
        Boolean a;
        try {
            cartPage.getDisplayedProduct();
            a = false;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            a = true;
        }
        assertTrue(a);
    }

    @Step
    public void removeSelectedProduct(String name){
        nameProduct = name;
        cartPage.removeSelectedProduct(name);
    }

    @Step
    public void selectedProductRemovedFromCartPage(){
        Boolean h;
        try{
            cartPage.removeSelectedProduct(nameProduct);
            h = false;
        } catch (org.openqa.selenium.NoSuchElementException e){
            h = true;
        }
        assertTrue(h);
    }
}
