package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.interactions.Compare;
import com.advantageonlineshopping.userinterfaces.OderPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPayOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OderPayment.BUTTON_NEXT_PAYORDER));
        actor.attemptsTo(Compare.laptopName());
        actor.attemptsTo(Click.on(OderPayment.BUTTON_PAYNOW_PAYORDER));
    }

    public static SelectPayOrder checkBuyLaptop() {
        return instrumented(SelectPayOrder.class);
    }
}
