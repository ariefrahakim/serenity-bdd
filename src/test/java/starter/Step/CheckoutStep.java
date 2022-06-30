package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CartPage;
import starter.Pages.CheckoutPage;
import starter.Pages.ProductPage;

import static org.junit.Assert.*;

public class CheckoutStep {

    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Step
    public void verifyYourInformationPage() {
        String headerPage = checkoutPage.getHeaderYourInformation();
        assertTrue(headerPage.equalsIgnoreCase("CHECKOUT: YOUR INFORMATION"));
    }

    @Step
    public void inputFirstName(String first) {
        checkoutPage.inputFirstName(first);
    }

    @Step
    public void inputLastName(String last) {
        checkoutPage.inputLastName(last);
    }

    @Step
    public void inputPostalCode(int post) {
        checkoutPage.inputPostalCode(post);
    }

    @Step
    public void emptyFirstNameField() {
        checkoutPage.emptyFirstNameField();
    }

    @Step
    public void emptyLastNameField() {
        checkoutPage.emptyLastNameField();
    }

    @Step
    public void emptyPostalCodeField() {
        checkoutPage.emptyPostalCodeField();
    }

    @Step
    public void clickContinueButton() {
        checkoutPage.clickContinueButton();
    }

    public void getHeaderOverviewPage(){
        String headerPage= checkoutPage.getHeaderOverviewPage();
        assertTrue(headerPage.equalsIgnoreCase("CHECKOUT: OVERVIEW"));
    }

    public void verifyCheckoutPage(){
        assertTrue(cartPage.getDisplayedProduct());
        for (int i=0; i<ProductPage.differentProduct.size(); i++){
            assertTrue(cartPage.getDisplayedDifferentProduct(i));
        }
        assertEquals(checkoutPage.verifyPriceCheckout(), CartPage.priceProduct);
    }

    public void verifyErrorMassageInformation() {
        assertTrue(checkoutPage.verifyErrorMassageInformation());
    }
}
