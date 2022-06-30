package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CheckoutPage;

import static org.junit.Assert.*;

public class CheckoutStep {

    CheckoutPage checkoutPage;

    @Step
    public void verifyYourInformationPage() {
        String headerPage = checkoutPage.getHeaderYourInformation();
        assertTrue(headerPage.equalsIgnoreCase("CHECKOUT: YOUR INFORMATION"));
    }

    @Step
    public void inputFirstName() {
        checkoutPage.inputFirstName();
    }

    @Step
    public void inputLastName() {
        checkoutPage.inputLastName();
    }

    @Step
    public void inputPostalCode() {
        checkoutPage.inputPostalCode();
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

    public void verifyErrorMassageInformation() {
        assertTrue(checkoutPage.verifyErrorMassageInformation());
    }
}
