package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.SortingStep;

public class SortingStepdefs {

    @Steps
    SortingStep sortingStep;

    @When("User click button sorting")
    public void userClickButtonSorting() {

    }

    @And("User select {string}")
    public void userSelectDropdown(String select) {
        sortingStep.dropDown(select);
    }

    @Then("The product will show product by {string}")
    public void theProductWillShowProductByPriceLowToHigh(String result) {
        sortingStep.resultSorting(result);
    }
}
