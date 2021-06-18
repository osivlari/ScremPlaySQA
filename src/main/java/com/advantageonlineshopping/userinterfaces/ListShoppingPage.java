package com.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ListShoppingPage extends PageObject {

    public static final Target OPTION_LIST_CART = Target.the("Opcion listado en carrito").locatedBy("//*[@id='menuCart']");
    public static final Target OPTION_BUTTON_CART_CHECKOUT= Target.the("Opcion checkout carrito compra").located(By.id("checkOutPopUp"));



}
