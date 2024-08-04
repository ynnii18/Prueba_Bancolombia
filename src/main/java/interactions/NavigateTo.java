package interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.constants.Endpoints.BANCOLOMBIA;
    public class NavigateTo implements Interaction {

        @Override
        @Step("{0} navega al sitio web de Bancolombia")
        public <T extends Actor> void performAs(T actor) {
            actor.wasAbleTo(
                    Open.url(BANCOLOMBIA)
            );
        }
        public static NavigateTo fromPage() {
            return instrumented(NavigateTo.class);
        }
}