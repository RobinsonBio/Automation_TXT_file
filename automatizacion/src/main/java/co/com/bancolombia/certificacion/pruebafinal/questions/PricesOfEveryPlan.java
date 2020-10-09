package co.com.bancolombia.certificacion.pruebafinal.questions;

import co.com.bancolombia.certificacion.pruebafinal.userinterfaces.PricesPlans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class PricesOfEveryPlan implements Question <List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        ArrayList<String> precios = new ArrayList();
        precios.add(Text.of(PricesPlans.FREE_PLAN).viewedBy(actor).asString());
        precios.add(Text.of(PricesPlans.GOLD_PLAN).viewedBy(actor).asString());
        precios.add(Text.of(PricesPlans.PLATINUM_PLAN).viewedBy(actor).asString());
        return  precios;
    }
    public static PricesOfEveryPlan found (){
        return new PricesOfEveryPlan();
    }
}
