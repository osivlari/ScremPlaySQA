package com.advantageonlineshopping.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import java.security.PublicKey;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class HomePage extends PageObject {

    public static final Target ENSURE_TIME = Target.the("Button option login user").locatedBy("//div[@id='speakersImg']");
    public static final Target BUTTON_SEARCH = Target.the("Button search in WEB").locatedBy("//div[@id='mobileSearch']//*[@id='menuSearch']");
    public static final Target BOX_SEARCH = Target.the("Box search").locatedBy("//input[@id='autoComplete']");
    public static final Target BUTTON_OPTION_LOGIN = Target.the("Button option login user").locatedBy("//*[@id='menuUser']");
    public static final Target USERNAME_DATE = Target.the("Box date user name").located(By.name("username"));
    public static final Target PASSWORD_DATE = Target.the("Box date password").located(By.name("password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Button option Sign im").located(By.id("sign_in_btnundefined"));
    public static final Target SELECT_IMG_LAPTOP = Target.the("Select img laptops buy").located(By.id("laptopsImg"));
}