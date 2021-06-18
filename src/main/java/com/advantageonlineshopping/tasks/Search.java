package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {

    String laptoptName;

    public Search(String laptoptName) {
        this.laptoptName = laptoptName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_SEARCH));
        actor.attemptsTo(Enter.theValue(laptoptName).into(HomePage.BOX_SEARCH).thenHit(Keys.ENTER));

    }

    public static Search laptop(String laptoptName){
        return instrumented(Search.class, laptoptName);
    }
}
