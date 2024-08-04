package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;
import questions.ValidateExistenceOfTheResult;
import task.CalculateRates;
import task.EnterTheFinanceManagementModule;
import userinterfaces.BancolombiaHomePage;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static utils.constants.Constants.ANALISTA;
import static utils.constants.Constants.PARAMETERS;

public class TransformInterestRatesStepDefinition {
    @Before
    public void setUpConfigurationsFront() {
        setTheStage(new OnlineCast());
        theActorCalled(ANALISTA);
    }

    @Dado("que el usuario ingresa a la página de Bancolombia al menú Gestionar las finanzas de mi negocio, convertidor de intereses")
    public void enterModule() {
        theActorInTheSpotlight().attemptsTo(
                EnterTheFinanceManagementModule.enterModule()
        );
    }

    @Cuando("ingresa los datos de la tasa nominal a convertir:")
    public void transformerInteres(Map<String, String> queryParameters) {
        theActorInTheSpotlight().remember(PARAMETERS, queryParameters);
        theActorInTheSpotlight().attemptsTo(
                CalculateRates.withParameters(queryParameters)
        );
    }

    @Cuando("debe observar el valor de la tasa nominal transformado a tasa efectiva")
    public void resultCalculate() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(BancolombiaHomePage.TASA_CALCULADA, isVisible()).forNoMoreThan(30).seconds());
        String valorRespuesta = OnStage.theActorInTheSpotlight().asksFor(ValidateExistenceOfTheResult.de(BancolombiaHomePage.TASA_CALCULADA));
        Assert.assertEquals("9.54 %", valorRespuesta.trim());
    }


}
