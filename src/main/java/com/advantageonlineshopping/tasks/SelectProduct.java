package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.interactions.Save;
import com.advantageonlineshopping.userinterfaces.LaptopProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LaptopProductsPage.OPTION_LAPTOP_SELECT).isDisplayed(),
                Click.on(LaptopProductsPage.OPTION_LAPTOP_SELECT),
                Save.laptopName(),
                Click.on(LaptopProductsPage.OPTION_ADDTOCART_SELECT));
    }

    public static SelectProduct selectLaptopProduct() {
        return instrumented(SelectProduct.class);
    }
}
