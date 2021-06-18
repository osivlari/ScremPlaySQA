package com.advantageonlineshopping.questions;
import com.advantageonlineshopping.interactions.Save;
import com.advantageonlineshopping.userinterfaces.OderPayment;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NameLapot implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return OderPayment.CHECK_NAMELAPTOP_PAYORDER.resolveFor(actor).getText().equals(Save.laptopName);
    }

    public static NameLapot equalsName(){
        return new NameLapot();
    }
}
