package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CartPage;
import starter.Pages.DetailProductPage;
import starter.Pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddToCartStep {

    ProductPage productPage;
    DetailProductPage detailProductPage;

    CartPage cartPage;

    @Step
    public void openProductPage(){
        productPage.open();
    }

    @Step
    public void clickDetailProduct(String name){
        productPage.clickProduct(name);
    }

    @Step
    public void verifyDetailProduct(){
        String expected = productPage.getNameProduct();
        String actual = detailProductPage.getNameDetailProduct();
        assertTrue(actual.equalsIgnoreCase(expected));
    }

    @Step
    public void isButtonCartDisplayed(){
        assertTrue(detailProductPage.verifyAddToCart());
    }

    @Step
    public void clickAddToCartButton(){
        detailProductPage.clickAddtoCartButton();
    }

    @Step
    public void isRemoveButtonAppear(){
        assertTrue(detailProductPage.isRemoveButtonAppear());
    }

    @Step
    public void clickCartPage(){
        detailProductPage.clickCartPage();
    }

    @Step
    public void verifyCartPage(){
        Boolean temp = false;
        assertTrue(cartPage.getDisplayedProduct());
        if(ProductPage.differentProduct.size() != 0) {
            for (int i=0; i<ProductPage.differentProduct.size(); i++){
                assertTrue(cartPage.getDisplayedDifferentProduct(i));
            }
        }
    }


    @Step
    public void addToCartButtonProductPage(String name){
        productPage.verifyCartButton(name);
        productPage.AddToCartButton();
    }

    @Step
    public void differentProductClick(String name){
        ProductPage.differentProduct.add(name);
        productPage.clickDifferentProduct(name);
    }

    @Step
    public void verifyDifferentDetailProduct(){
        Boolean temp = false;
        String actual = detailProductPage.getNameDetailProduct();
        for (int i=0; i<ProductPage.differentProduct.size(); i++){
            if(ProductPage.differentProduct.get(i).equalsIgnoreCase(actual)){
                temp = true;
            }
        }
        assertTrue(temp);
    }

    @Step
    public void verifyCartDifferent(){
        detailProductPage.verifyDifferentAddToCart();
    }


    @Step
    public void verifyRemoveButton(){
        detailProductPage.verifyDifferentProductRemove();
    }

    @Step
    public void verifyCartDifProductPage(String name){
        ProductPage.differentProduct.add(name);
        productPage.verifyCartButtonDifProduct(name);
        productPage.AddToCartButton();
    }

}
