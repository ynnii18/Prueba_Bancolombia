package interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BancolombiaHomePage.*;

public class SelectModule implements Interaction {

    @Override
    @Step("{0} selecciona el módulo de Gestionar mis finanzas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HEADER_PYMES, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(HEADER_PYMES),
                WaitUntil.the(SOLUCIONES_NO_FINANCIERAS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(SOLUCIONES_NO_FINANCIERAS),
                WaitUntil.the(HERRAMIENTAS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(HERRAMIENTAS),
                WaitUntil.the(BOTON_SIGUIENTE, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BOTON_SIGUIENTE),
                WaitUntil.the(GESTIONAR_FINANZAS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(GESTIONAR_FINANZAS),
                WaitUntil.the(GESTIONAR_TASAS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(GESTIONAR_TASAS),
                Click.on(GESTIONAR_TASAS_NOMINAL_A_EFECTIVA)
        );
    }

    public static SelectModule module() {
        return instrumented(SelectModule.class);
    }
}
