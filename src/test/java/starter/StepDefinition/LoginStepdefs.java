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

    @Given("I already on login page")
    public void iAlreadyOnLoginPage() {
        loginStep.openLoginPage();
    }

    @When("I input my username")
    public void iInputMyUsername() {
        loginStep.InputUsername();
    }

    @And("I input my password")
    public void iInputMyPassword() {
        loginStep.InputPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginStep.clickLoginButton();
    }

    @Then("the system show products pages")
    public void theSystemShowProductsPages() {
        loginStep.verifyProductPage();
    }
}
