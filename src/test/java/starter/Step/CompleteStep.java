package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.CompletePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompleteStep {

    CompletePage completePage;

    @Step
    public void headerDisplayed(){
        assertTrue(completePage.headerDisplayed());
    }

}
