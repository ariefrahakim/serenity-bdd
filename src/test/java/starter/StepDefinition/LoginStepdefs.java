package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.Pages.ProductPage;
import starter.Step.LoginStep;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginStepdefs {

    @Steps
    LoginStep loginStep;

    @Given("user already on login page")
    public void iAlreadyOnLoginPage() {
        loginStep.openLoginPage();
    }

    @When("user input valid username")
    public void iInputMyUsername() {
        loginStep.InputUsername();
    }

    @And("user input valid password")
    public void iInputMyPassword() {
        loginStep.InputPassword();
    }

    @And("user click login button")
    public void iClickLoginButton() {
        loginStep.clickLoginButton();
    }

    @Then("the system show products pages")
    public void theSystemShowProductsPages() {
        loginStep.verifyProductPage();
    }

    @When("user input invalid username")
    public void iInputInvalidUsername() {
        loginStep.inputInvalidUsername();
    }

    @And("user input invalid password")
    public void iInputInvalidPassword() {
        loginStep.inputInvalidPassword();
    }

    @Then("error massage appear")
    public void errorMassageAppear() {
        loginStep.verifyErrorMassage();
    }

    @When("user input valid another username")
    public void userInputValidAnotherUsername() {
        loginStep.inputValidAnotherAcc();

    }

    @Given("User already login")
    public void userAlreadyLogin() {
        loginStep.openLoginPage();
        loginStep.InputUsername();
        loginStep.InputPassword();
        loginStep.clickLoginButton();
    }
}
