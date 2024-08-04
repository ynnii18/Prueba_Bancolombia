package task;

import interactions.NavigateTo;
import interactions.SelectModule;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterTheFinanceManagementModule implements Task {
    @Override
    @Step("{0} ingresa al módulo de Gestionar las Finanzas")
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                NavigateTo.fromPage(),
                SelectModule.module()
        );
    }

    public static EnterTheFinanceManagementModule enterModule() {
        return instrumented(EnterTheFinanceManagementModule.class);
    }

}
