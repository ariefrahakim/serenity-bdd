package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement fieldUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement fieldPassword;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    WebElement ButtonLogin;

    public void InputUsername(){
        fieldUsername.sendKeys("standard_user");
    }

    public void InputPassword(){
        fieldPassword.sendKeys("secret_sauce");
    }

    public void clickLoginButton(){
        ButtonLogin.click();
    }
}
