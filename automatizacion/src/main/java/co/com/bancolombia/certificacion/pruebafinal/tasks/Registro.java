package co.com.bancolombia.certificacion.pruebafinal.tasks;


import co.com.bancolombia.certificacion.pruebafinal.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.pruebafinal.userinterfaces.RegisterFields.*;

public class Registro implements Task {

    private Usuario usuario;

    public Registro(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario.getEmail()).into(INSERT_EMAIL));
        actor.attemptsTo(Enter.theValue(usuario.getPassword()).into(INSERT_PASSWORD));
        actor.attemptsTo(Enter.theValue(usuario.getPassword1()).into(INSERT_PASSWORD1));
        actor.attemptsTo(Click.on(REGISTER_BUTTON));
    }

    public static  Registro delUsuarioNuevo (Usuario usuario){
    return Tasks.instrumented(Registro.class,usuario);
    }
}
