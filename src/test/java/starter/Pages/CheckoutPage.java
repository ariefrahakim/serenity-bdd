package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourInformationPage;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement FistNameField;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement LastNameField;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    WebElement PostalCodeField;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement emptyFistName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement emptyLastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    WebElement emptyPostalCode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement ContinueButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement OverviewPage;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]")
    WebElement ErrorMassageInformation;

    public String getHeaderYourInformation() {
        return YourInformationPage.getText();
    }

    public void inputFirstName() {
        FistNameField.sendKeys("Olive");
    }

    public void inputLastName() {
        LastNameField.sendKeys("Jhonsen");
    }

    public void inputPostalCode() {
        PostalCodeField.sendKeys("443228");
    }

    public void emptyFirstNameField() {
        emptyFistName.sendKeys("");
    }

    public void emptyLastNameField() {
        emptyLastName.sendKeys("");
    }

    public void emptyPostalCodeField() {
        emptyPostalCode.sendKeys("");
    }

    public void clickContinueButton(){
        ContinueButton.click();
    }

    public String getHeaderOverviewPage(){
        return OverviewPage.getText();
    }

    public Boolean verifyErrorMassageInformation(){
        return ErrorMassageInformation.isDisplayed();
    }
}

