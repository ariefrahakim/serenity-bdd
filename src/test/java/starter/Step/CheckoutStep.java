package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CartPage;
import starter.Pages.CheckoutPage;
import starter.Pages.ProductPage;

import java.util.List;

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

    @Step
    public void verifyCheckoutPage(){
        assertTrue(cartPage.getDisplayedProduct());
        for (int i=0; i<ProductPage.differentProduct.size(); i++){
            assertTrue(cartPage.getDisplayedDifferentProduct(i));
        }
        assertEquals(checkoutPage.verifyPriceCheckout(), CartPage.priceProduct);
    }

    @Step
    public void verifyErrorMassageInformation() {
        assertTrue(checkoutPage.verifyErrorMassageInformation());
    }

    @Step
    public void verifySummaryPayment(){
        assertTrue(checkoutPage.verifyPaymentInformation());
        double expectedItemTotal = 0;
        for (int i=0; i<CartPage.priceProduct.size(); i++){
            expectedItemTotal += CartPage.priceProduct.get(i);
        }
        double actualItemTotal = Double.parseDouble(checkoutPage.getItemTotal().replaceAll("Item total: \\$", ""));
        assertEquals(String.valueOf(expectedItemTotal), String.valueOf(actualItemTotal));
        assertTrue(checkoutPage.verifyShippingInformation());
        double tax = Double.parseDouble(checkoutPage.getTax().replaceAll("Tax: \\$", ""));
        Double sumTotal = Double.parseDouble(checkoutPage.sumTotal().replaceAll("Total: \\$", ""));
        double expectedSumTotal = actualItemTotal + tax;
        assertEquals(String.format("%.2f", expectedSumTotal).replaceAll(",","."), String.valueOf(sumTotal));
    }

    @Step
    public void clickFinishButton(){
        checkoutPage.clickFinishButton();
    }
}
