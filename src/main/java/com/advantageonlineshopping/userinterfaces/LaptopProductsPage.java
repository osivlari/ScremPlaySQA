package com.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LaptopProductsPage extends PageObject {

    public static final Target OPTION_LAPTOP_SELECT = Target.the("Opcion Guardar en carrito").locatedBy("//button[contains(text(),'BUY NOW')]");
    public static final Target OPTION_ADDTOCART_SELECT = Target.the("Opcion agregar al  carrito").locatedBy(    "//button[contains(text(),'ADD TO CART')]");
    public static final Target LAPTOP_NAME = Target.the("Name laptop buy").locatedBy(    "//a[contains(text(),'HP PAVILION 15Z TOUCH LAPTOP')]");
}
