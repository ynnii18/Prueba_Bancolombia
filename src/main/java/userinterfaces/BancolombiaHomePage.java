package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaHomePage {
    public static final Target HEADER_PYMES = Target.the("Negocios'")
            .locatedBy("#header-pymes");
    public static final Target SOLUCIONES_NO_FINANCIERAS = Target.the("Soluciones no financieras'")
            .locatedBy("#menu-productos-finan");
    public static final Target HERRAMIENTAS = Target.the("Menú Herramientas'")
            .locatedBy("#linkherramientas");
    public static final Target BOTON_SIGUIENTE = Target.the("Boton siguiente'")
            .locatedBy(".bc-fab-button.bc-fab-button-mini");
    public static final Target GESTIONAR_FINANZAS = Target.the("Gestionar las finanzas de mi negocio'")
            .locatedBy(".tools-menu-item a[data-uuid='82e3fb3b-32f0-4083-bdc7-c52f39f84b32']");
    public static final Target GESTIONAR_TASAS = Target.the("Convertir tasas'")
            .locatedBy("div.bc-col-md-6.bc-col-xl-4.bc-col-lg-4.bc-col-sm-6.bc-col-xs-6.bc-my-2.bc-px-2.card-item a.card-link[href='/negocios/herramientas/convertidor-de-tasas'] h5#titleCard");
    public static final Target GESTIONAR_TASAS_NOMINAL_A_EFECTIVA= Target.the("Gestionar tasas'")
            .locatedBy("#btntoolUno");
    public static final Target PERIODICIDAD= Target.the("periodicidad-deseada")
            .locatedBy("#periodicidad-deseada");
    public static final Target CAPITALIZACION= Target.the("ingresar-capitalizacion")
            .locatedBy("#capitalizacion");
    public static final Target INTERES= Target.the("ingresar-interes")
            .locatedBy("#interes");
    public static final Target TASA_CALCULADA = Target.the("resultado de la tasa de interés")
            .locatedBy("#respuesta");
    public static final Target BODY = Target.the("Body")
            .locatedBy("#toolUno");
}
