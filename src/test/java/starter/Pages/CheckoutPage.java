package starter.Pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends PageObject {

    List<Double> listPriceCheckout = new ArrayList<>();

    @FindBy(className = "inventory_item_price")
    List<WebElementFacade> priceCheckout;

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

    @FindBy(className = "summary_value_label")
    WebElement paymentInformation;

    @FindBy(className = "summary_subtotal_label")
    WebElement itemTotal;

    @FindBy(xpath = "//*[text()=\"FREE PONY EXPRESS DELIVERY!\"]")
    WebElement shippingInformation;

    @FindBy(className = "summary_tax_label")
    WebElement tax;

    @FindBy(className = "summary_total_label")
    WebElement sumTotal;

    @FindBy(id = "finish")
    WebElement buttonFinish;

    public String getHeaderYourInformation() {
        return YourInformationPage.getText();
    }

    public void inputFirstName(String first) {
        FistNameField.sendKeys(first);
    }

    public void inputLastName(String last) {
        LastNameField.sendKeys(last);
    }

    public void inputPostalCode(int post) {
        PostalCodeField.sendKeys(String.valueOf(post));
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

    public List<Double> verifyPriceCheckout(){
        for (WebElementFacade p : priceCheckout){
            listPriceCheckout.add(Double.valueOf(p.getText().replaceAll("\\$","")));
        }
        return listPriceCheckout;
    }

    public Boolean verifyPaymentInformation(){
        return paymentInformation.isDisplayed();
    }

    public String getItemTotal(){
        return itemTotal.getText();
    }

    public Boolean verifyShippingInformation(){
        return shippingInformation.isDisplayed();
    }

    public String getTax(){
        return tax.getText();
    }

    public String sumTotal(){
        return sumTotal.getText();
    }

    public void clickFinishButton(){
        buttonFinish.isDisplayed();
        buttonFinish.click();
    }

}

