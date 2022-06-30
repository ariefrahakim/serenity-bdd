package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.LoginPage;
import starter.Pages.ProductPage;
import static org.junit.Assert.*;

public class LoginStep {

    LoginPage loginPage;
    ProductPage productPage;

    @Step
    public void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void InputUsername(){
        loginPage.InputUsername();
    }

    @Step
    public void InputPassword(){
        loginPage.InputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyProductPage(){
        String headerProductPage = productPage.getHeaderProductPage();
        assertTrue(headerProductPage.equalsIgnoreCase("products"));
    }

    public void inputInvalidUsername(){
        loginPage.inputInvalidUsername();
    }

    public void inputInvalidPassword(){
        loginPage.inputInvalidPassword();
    }

    @Step
    public void inputValidAnotherAcc(){
        loginPage.inputValidAnotherAcc();
    }

    public void verifyErrorMassage(){
        assertTrue(loginPage.verifyErrorMassage());
    }
}
