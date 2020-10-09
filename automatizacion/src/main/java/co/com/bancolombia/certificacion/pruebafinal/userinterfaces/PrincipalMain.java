package co.com.bancolombia.certificacion.pruebafinal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalMain {
    public static final Target BOTON_COOKIE= Target.the("Botton to choose the basic plan").
            located(By.id("ajaxAcknowledgeCookie"));

    public static final Target BOTON_PRECIO = Target.the("Botton to see the plans").
            located(By.xpath("//*[@title='Precios']"));

    public static final Target BOTON_PLAN_BASICO = Target.the("Botton to choose the basic plan").
            located(By.id("price-basic"));

    public static final Target SUCCESSFULL_REGISTER = Target.the("Successfull register message").
            located(By.id("showError"));



}
