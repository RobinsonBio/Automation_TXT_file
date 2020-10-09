package co.com.bancolombia.certificacion.pruebafinal.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.pruebafinal.userinterfaces.PrincipalMain.SUCCESSFULL_REGISTER;

public class ElMensajeDeRegistro implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SUCCESSFULL_REGISTER).viewedBy(actor).asString().trim();
    }
}
