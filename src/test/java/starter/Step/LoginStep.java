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
}
