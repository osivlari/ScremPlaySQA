package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.userinterfaces.LaptopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLaptop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(LaptopPage.OPTION_LAPTOP).isDisplayed());
        actor.attemptsTo(Click.on(LaptopPage.OPTION_LAPTOP));
    }

    public static SelectLaptop selectLaptops() {
        return instrumented(SelectLaptop.class);
    }
}
