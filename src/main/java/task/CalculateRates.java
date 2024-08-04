package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.BancolombiaHomePage;

import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BancolombiaHomePage.*;


public class CalculateRates implements Task {

    private final Map<String, String> queryParameters;

    public CalculateRates(Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;

    }

    @Override
    @Step("{0} ingresa los parametro o valores para la transformación de la tasa de interes nominal a efectiva")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PERIODICIDAD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PERIODICIDAD),
                SelectFromOptions.byVisibleText(queryParameters.get("periodicidad deseada")).from(PERIODICIDAD),
                SelectFromOptions.byValue("2").from(PERIODICIDAD),
                WaitUntil.the(CAPITALIZACION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAPITALIZACION),
                SelectFromOptions.byVisibleText(queryParameters.get("Ingresa la capitalización")).from(CAPITALIZACION),
                SelectFromOptions.byValue("1").from(CAPITALIZACION),
                WaitUntil.the(INTERES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BancolombiaHomePage.INTERES),
                Enter.theValue(queryParameters.get("Ingresa la tasa de interés")).into(BancolombiaHomePage.INTERES)
        );
    }

    public static CalculateRates withParameters(Map<String, String> queryParameters) {
        return new CalculateRates(queryParameters);
    }
}
