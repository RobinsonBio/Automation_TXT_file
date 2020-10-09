package co.com.bancolombia.certificacion.pruebafinal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFields {
    public static final Target INSERT_EMAIL = Target.the("Field to insert the email").
            located(By.id("u_econtact"));

    public static final Target INSERT_PASSWORD = Target.the("Field to insert the first password").
            located(By.id("u_pass"));

    public static final Target INSERT_PASSWORD1 = Target.the("Field to insert the confirmation password").
            located(By.id("u_pass2"));

    public static final Target REGISTER_BUTTON = Target.the("Field to insert the confirmation password").
            located(By.id("submit-form-button"));


}
