package com.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OderPayment extends PageObject {


    public static final Target BUTTON_NEXT_PAYORDER = Target.the("Button next in payorder").located(By.id("next_btn"));
    public static final Target CHECK_NAMELAPTOP_PAYORDER = Target.the("Button next in payorder").locatedBy("body.ng-scope:nth-child(2) div.uiview.ng-scope:nth-child(8) section.ng-scope:nth-child(2) tbody:nth-child(1) tr.ng-scope.lastProduct td:nth-child(2) a:nth-child(1) > h3.ng-binding:nth-child(1)");
    public static final Target BUTTON_PAYNOW_PAYORDER = Target.the("Button pay now in payorder").located(By.id("pay_now_btn_SAFEPAY"));
}
