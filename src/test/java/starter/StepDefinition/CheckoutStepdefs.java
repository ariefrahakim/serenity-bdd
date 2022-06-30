package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.CheckoutPage;
import starter.Step.CheckoutStep;

public class CheckoutStepdefs {
    @Steps
    CheckoutStep checkoutStep;

    @Then("The your information page appear")
    public void theYourInformationPageAppear() {
        checkoutStep.verifyYourInformationPage();
    }

    @When("User input first name field")
    public void userInputFirstNameField() {
        checkoutStep.inputFirstName();
    }

    @And("user input last name field")
    public void userInputLastNameField() {
        checkoutStep.inputLastName();
    }

    @And("user input zip or postal code")
    public void userInputZipOrPostalCode() {
        checkoutStep.inputPostalCode();
    }

    @When("User not fill first name field")
    public void userNotFillFirstNameField() {
        checkoutStep.emptyFirstNameField();
    }
    @And("user not fill last name field")
    public void userNotFillLastNameField() {
        checkoutStep.emptyLastNameField();
    }
    @And("user not fill zip or postal code")
    public void userNotFillZipOrPostalCode() {
        checkoutStep.emptyPostalCodeField();
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        checkoutStep.clickContinueButton();
    }

    @Then("the Checkout information page appear")
    public void theCheckoutInformationPageAppear() {
        checkoutStep.getHeaderOverviewPage();
    }

    @Then("error massage appear on your information page")
    public void errorMassageAppearOnYourInformationPage() {
        checkoutStep.verifyErrorMassageInformation();
    }
}
