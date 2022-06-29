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

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement InvalidUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement InvalidPassword;

    @FindBy(xpath ="//*[@id=\"user-name\"]")
    WebElement LockedAcc;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement ErrorMassage;

    public void InputUsername(){
        fieldUsername.sendKeys("standard_user");
    }

    public void InputPassword(){
        fieldPassword.sendKeys("secret_sauce");
    }

    public void clickLoginButton(){
        ButtonLogin.click();
    }

    public void inputInvalidUsername(){
        InvalidUsername.sendKeys("nshmahira");
    }

    public void inputInvalidPassword(){
        InvalidPassword.sendKeys("40199");
    }

    public void inputValidAnotherAcc(){
        LockedAcc.sendKeys("locked_out_user");
    }

    public Boolean verifyErrorMassage(){
        return ErrorMassage.isDisplayed();
    }
}
