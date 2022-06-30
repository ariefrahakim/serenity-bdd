package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddToCartStep;

public class AddToCartStepdefs {

    @Steps
    AddToCartStep addToCartStep;

    @Then("Detail product appear")
    public void detailProductAppear() {
        addToCartStep.verifyDetailProduct();
    }

    @When("User click add to cart button")
    public void iClickAddToCartButton() {
        addToCartStep.isButtonCartDisplayed();
        addToCartStep.clickAddToCartButton();
    }

    @Then("Cart button changed to remove button")
    public void cartButtonChangedToRemoveButton() {
        addToCartStep.isRemoveButtonAppear();
    }

    @And("selected product appear on cart page")
    public void selectedProductAppearOnCartPage() {
        addToCartStep.verifyCartPage();
    }

    @When("User click cart page")
    public void iClickCartPage() {
        addToCartStep.clickCartPage();
    }

    @When("User click Product with name {string}")
    public void userClickProductWithNameProducts(String name) {
        addToCartStep.clickDetailProduct(name);
    }

    @When("User click add to cart button to selected product with name {string}")
    public void userClickAddToCartButtonToSelectedProductWithName(String name) {
        addToCartStep.addToCartButtonProductPage(name);
    }

    @When("User back to product page")
    public void userBackToProductPage() {
        addToCartStep.openProductPage();
    }


    @And("User click different product with name {string}")
    public void userClickDifferentProductWithName(String name) {
        addToCartStep.differentProductClick(name);
    }

    @Then("Detail different product appear")
    public void detailDifferentProductAppear() {
        addToCartStep.verifyDifferentDetailProduct();
        addToCartStep.verifyCartDifferent();
    }

    @When("User click add to cart button different product")
    public void userClickAddToCartButtonDifferentProduct() {
        addToCartStep.clickAddToCartButton();
    }

    @Then("Cart button different product changed to remove button")
    public void cartButtonDifferentProductChangedToRemoveButton() {
        addToCartStep.verifyRemoveButton();
    }

    @When("User click add to cart button to different selected product with name {string}")
    public void userClickAddToCartButtonToDifferentSelectedProductWithName(String name) {
        addToCartStep.verifyCartDifProductPage(name);
    }

    @And("User already add to cart selected product with name {string}")
    public void userAlreadyAddToCartSelectedProductWithName(String name) {
        addToCartStep.addToCartButtonProductPage(name);
    }

    @And("User already on cart page")
    public void userAlreadyOnCartPage() {
        addToCartStep.clickCartPage();
        addToCartStep.verifyCartPage();
    }

    @When("User click checkout button")
    public void userClickCheckoutButton() {
        addToCartStep.clickCheckoutButton();
    }

    @And("User already add to cart selected different product with name {string}")
    public void userAlreadyAddToCartSelectedDifferentProductWithName(String name) {
        addToCartStep.verifyCartDifProductPage(name);
    }
}
