package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    String name;
    String password;

    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //actor.attemptsTo(WaitUntil.the(HomePage.ENSURE_TIME,isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Ensure.that(HomePage.ENSURE_TIME).isDisplayed());
        actor.attemptsTo(Click.on(HomePage.BUTTON_OPTION_LOGIN));
        actor.attemptsTo(Enter.theValue(name).into(HomePage.USERNAME_DATE));
        actor.attemptsTo(Enter.theValue(password).into(HomePage.PASSWORD_DATE));
        actor.attemptsTo(Click.on(HomePage.BUTTON_SIGN_IN));
        actor.attemptsTo(Click.on(HomePage.SELECT_IMG_LAPTOP));
    }

    public static Login datesUser(String name, String  password) {
        return instrumented(Login.class, name, password);
    }

}
