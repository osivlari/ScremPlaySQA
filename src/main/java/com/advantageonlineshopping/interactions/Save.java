package com.advantageonlineshopping.interactions;

import com.advantageonlineshopping.userinterfaces.LaptopProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Save implements Interaction {

    public static String laptopName;

    @Override
    public <T extends Actor> void performAs(T actor) {

        laptopName = LaptopProductsPage.LAPTOP_NAME.resolveFor(actor).getText();


    }

    public static Save laptopName(){
        return new Save();
    }
}
