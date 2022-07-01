package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.CartPage;
import starter.Step.AddToCartStep;
import starter.Step.RemoveStep;

public class RemoveStepdefs {

    @Steps
    RemoveStep removeStep;

    @Steps
    CartPage cartPage;

    @Steps
    AddToCartStep addToCartStep;

    @When("User remove product from the cart page")
    public void userRemoveProductFromTheCartPage() {
        removeStep.clickRemoveButton();
    }

    @Then("Product removed from cart page")
    public void productRemovedFromCartPage() {
        removeStep.notDisplayedProduct();
    }

    @And("Add to cart button product with name {string} appear")
    public void addToCartButtonProductWithNameAppear(String name) {
        addToCartStep.openProductPage();
        addToCartStep.clickDetailProduct(name);
        addToCartStep.isButtonCartDisplayed();
        addToCartStep.openProductPage();
        addToCartStep.isButtonCartDisplayed();
    }

    @When("User remove product with name {string} from the cart page")
    public void userRemoveProductWithNameFromTheCartPage(String name) {
        removeStep.removeSelectedProduct(name);
    }

    @Then("Selected product removed from cart page")
    public void selectedProductRemovedFromCartPage() {
        removeStep.selectedProductRemovedFromCartPage();
    }
}
