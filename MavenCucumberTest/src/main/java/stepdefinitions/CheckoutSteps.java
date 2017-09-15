package stepdefinitions;

import cucumber.api.java.en.*;
import implementation.Checkout;
import static org.junit.Assert.*;

public class CheckoutSteps {
    Checkout checkout;
    int bananaPrice = 0;

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(40, checkout.total());    
    }
}
