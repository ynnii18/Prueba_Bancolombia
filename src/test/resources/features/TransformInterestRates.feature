#language: es

@Prueba
Característica: Yo como dueño del producto requiero convertir la tasa de interes de tasa nominal a tasa efectiva

  Antecedentes: Ingreso al modulo de transformación de tasas
    Dado que el usuario ingresa a la página de Bancolombia al menú Gestionar las finanzas de mi negocio, convertidor de intereses

  Escenario: Calculo de tasa nominal a tasa efectiva
    Cuando ingresa los datos de la tasa nominal a convertir:
      | Ingresa la tasa de interés | 20        |
      | periodicidad deseada       | Semestral |
      | Ingresa la capitalización  | Anual     |
    Entonces debe observar el valor de la tasa nominal transformado a tasa efectiva

