package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class Login extends PageObject {

    @FindBy(id ="txtUsername")
    WebElement fieldUsername;

    @FindBy(id ="txtPassword")
    WebElement fieldPassword;

    @FindBy(id ="btnLogin")
    WebElement btnLogin;

    @FindBy(id ="welcome")
    WebElement landingPageHome;

    public void InputUsername() { fieldUsername.sendKeys("Admin"); }

    public void InputPassword() { fieldPassword.sendKeys("admin123"); }

    public void btnLogin() { btnLogin.click(); }

    public Boolean verifyLandingHomePage() {return landingPageHome.isDisplayed(); }

}
