package co.com.bancolombia.certificacion.pruebafinal.stepdefinitions;

import co.com.bancolombia.certificacion.pruebafinal.models.Usuario;
import co.com.bancolombia.certificacion.pruebafinal.questions.PricesOfEveryPlan;
import co.com.bancolombia.certificacion.pruebafinal.tasks.Registro;
import co.com.bancolombia.certificacion.pruebafinal.utils.SavingToTxt;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.bancolombia.certificacion.pruebafinal.userinterfaces.PrincipalMain.*;


public class RegistrarUsuarioStepDefinition {

    @Before
    public void SetUpOnStage() {
        OnStage.setTheStage(Cast.ofStandardActors());

    }
    @Managed
    private WebDriver SuNavegador;

    @Given("^(.*) is on the main page$")
    public void theUserIsOnTheMainPage(String nombre) {
        OnStage.theActorCalled(nombre).can(BrowseTheWeb.with(SuNavegador));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.123formbuilder.com/es"));

    }

    @When("^he chooses a plan$")
    public void heChoosesAPlan() {

        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BOTON_COOKIE));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BOTON_PRECIO));
        SavingToTxt.prices(OnStage.theActorInTheSpotlight().asksFor(PricesOfEveryPlan.found()));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BOTON_PLAN_BASICO));




    }

    @When("^he registers on the page$")
    public void heRegistersOnThePage( List<Usuario> register_list) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.delUsuarioNuevo(register_list.get(0)));
    }

    @Then("^he will see the message (.*)\\.$")
    public void heWillSeeTheMessage(String mensaje) {

    }

}

