package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.CheckoutPage;
import starter.Step.CheckoutStep;
import starter.Step.CompleteStep;

public class CheckoutStepdefs {
    @Steps
    CheckoutStep checkoutStep;

    @Steps
    CompleteStep completeStep;

    @Then("The your information page appear")
    public void theYourInformationPageAppear() {
        checkoutStep.verifyYourInformationPage();
    }

    @When("User input first name field with {string}")
    public void userInputFirstNameField(String first) {
        checkoutStep.inputFirstName(first);
    }

    @And("user input last name field with {string}")
    public void userInputLastNameField(String last) {
        checkoutStep.inputLastName(last);
    }

    @And("user input zip or postal code with {int}")
    public void userInputZipOrPostalCode(int post) {
        checkoutStep.inputPostalCode(post);
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
        checkoutStep.verifyCheckoutPage();
        checkoutStep.verifySummaryPayment();
    }

    @Then("error massage appear on your information page")
    public void errorMassageAppearOnYourInformationPage() {
        checkoutStep.verifyErrorMassageInformation();
    }


    @And("User already on checkout page")
    public void userAlreadyOnCheckoutPage() {
        checkoutStep.verifyYourInformationPage();
    }

    @When("User click finish button")
    public void userClickFinishButton() {
        checkoutStep.clickFinishButton();
    }

    @Then("Checkout Complete Page appear")
    public void checkoutCompletePageAppear() {
        completeStep.headerDisplayed();
    }
}
