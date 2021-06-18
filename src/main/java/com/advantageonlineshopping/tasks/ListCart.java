package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.userinterfaces.ListShoppingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ListShoppingPage.OPTION_LIST_CART));
        actor.attemptsTo(Click.on(ListShoppingPage.OPTION_BUTTON_CART_CHECKOUT));
    }

    public static ListCart cartAll(){
        return instrumented(ListCart.class);
    }
}
