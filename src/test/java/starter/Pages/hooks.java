package starter.Pages;


import io.cucumber.java.After;

public class hooks {
    @After
    public void afterScenario(){
        ProductPage.differentProduct.clear();
    }
}
