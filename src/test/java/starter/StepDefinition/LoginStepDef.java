package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.Step.LoginStep;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class LoginStepDef {

    @Steps
    LoginStep loginStepDef;

    @Given("Go to the website login")
    public void goToTheWebsiteLogin() { loginStepDef.openLoginPage();
    }

    @When("user input valid username")
    public void userInputValidUsername() { loginStepDef.InputUsername();
    }

    @And("user input valid password")
    public void userInputValidPassword() { loginStepDef.InputPassword();
    }

    @And("user click login button")
    public void userClickLoginButton() { loginStepDef.clickLoginButton();
    }

    @Then("user can landing on home page")
    public void userCanLandingOnHomePage() { loginStepDef.verifyLandingPage();
    }
}
