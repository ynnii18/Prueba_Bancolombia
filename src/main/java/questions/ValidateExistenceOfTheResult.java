package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BancolombiaHomePage.GESTIONAR_TASAS;
import static userinterfaces.BancolombiaHomePage.INTERES;

public class ValidateExistenceOfTheResult implements Question<String> {
    private final Target target;

    public ValidateExistenceOfTheResult(Target target) {
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {

        if (target.resolveFor(actor).isDisplayed()) {
            return Text.of(target).answeredBy(actor);
        } else {
            throw new AssertionError("El elemento no es visible.");
        }
    }

    public static ValidateExistenceOfTheResult de(Target target) {
        return new ValidateExistenceOfTheResult(target);
    }
}