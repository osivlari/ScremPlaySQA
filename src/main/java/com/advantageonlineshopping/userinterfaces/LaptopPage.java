package com.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LaptopPage extends PageObject {

    public static final Target OPTION_LAPTOP = Target.the("Opcion seleccion portatil").locatedBy("//div[@id='laptopsImg']");
}
