package co.com.bancolombia.certificacion.pruebafinal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PricesPlans {

    public static final Target FREE_PLAN = Target.the("Free plan text").locatedBy("//*[@class='price-free']");
    public static final Target GOLD_PLAN = Target.the("Free plan text").locatedBy("(//*[@class='price-subtitle'])[1]");
    public static final Target PLATINUM_PLAN = Target.the("Free plan text").locatedBy("(//*[@class='price-subtitle'])[2]");

}
