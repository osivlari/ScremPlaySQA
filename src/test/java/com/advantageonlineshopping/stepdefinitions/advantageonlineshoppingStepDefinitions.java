package com.advantageonlineshopping.stepdefinitions;

import com.advantageonlineshopping.tasks.*;
import com.advantageonlineshopping.questions.*;
import com.advantageonlineshopping.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class advantageonlineshoppingStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private final Actor Oscar = Actor.named("Oscar");

    @Before
    public void setUp() {
        Oscar.can(BrowseTheWeb.with(navegador));
    }

    @Given("^the user logs in the page username (.*),(.*)$")
    public void userLoginInThePageWEb(String name, String password) {
        Oscar.wasAbleTo(Open.browserOn(new HomePage()));
        Oscar.attemptsTo(Login.datesUser(name, password));
    }

    @When("^you select laptops and select the available laptop$")
    public void userSelectLaptop() {
        Oscar.attemptsTo(SelectProduct.selectLaptopProduct());
    }

    @Then("^add to the shopping cart$")
    public void listToCartShopping() {
        Oscar.attemptsTo(ListCart.cartAll());
    }

    @And("^Verify the laptop Name$")
    public void procesBuyLaptopAndCheck() {
        Oscar.attemptsTo(SelectPayOrder.checkBuyLaptop());
    }

    @When("^he search a (.*) laptop$")
    public void searchLaptop(String laptopName) {
        Oscar.attemptsTo(Search.laptop(laptopName));
    }

    @Then("^He validates (.*)$")
    public void resultSearch(String result) {
        Oscar.should(seeThat(Validate.search(result)));
    }

}

