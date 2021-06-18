package com.advantageonlineshopping.questions;

import com.advantageonlineshopping.userinterfaces.ResulSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validate implements Question {

    String result;

    public Validate(String result) {
        this.result = result;
    }


    @Override
    public Object answeredBy(Actor actor) {
        return ResulSearchPage.CHECK_RESULT_SEARCH.resolveFor(actor).getText().equals(result);
    }

    public static Validate search(String result) {
        return new Validate(result);
    }
}
