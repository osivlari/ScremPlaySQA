package com.advantageonlineshopping.interactions;

import com.advantageonlineshopping.questions.NameLapot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Compare implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(NameLapot.equalsName()));
    }

    public static Compare laptopName(){
        return new Compare();
    }
}
