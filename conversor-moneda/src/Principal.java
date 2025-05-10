import java.util.Scanner;

/**
 * Clase principal para ejecutar el conversor de moneda.
 */
public class Principal {
    public static void main(String[] args) {

        // API Key para obtener tasas de cambio
        String apiKey = "1854209d1ecfaafecee1594f";           //Api key asignada.
        ConversionMoneda api = new ConversionMoneda(apiKey);  // Instancia de ConversionMoneda
        int opcion = 0;                                       // Variable para almacenar la opción del usuario
        Operaciones operaciones = new Operaciones();          // Instancia de operaciones matemáticas
        Scanner teclado = new Scanner(System.in);             // Scanner para entrada de datos
        Divisa tasas = null;                                  // Variable para almacenar las tasas de cambio

        try {
            // Se obtiene la tasa de cambio desde USD
            tasas = api.obtenerTasaDeCambio("USD");
            System.out.println("Tasa de cambio desde USD:");
            System.out.println("COP: " + tasas.COP());
            System.out.println("BRL: " + tasas.BRL());
            System.out.println("VES: " + tasas.VES());
            System.out.println("PEN: " + tasas.PEN());
            System.out.println("BOB: " + tasas.BOB());
            System.out.println("ARS: " + tasas.ARS());
            System.out.println("PYG: " + tasas.PYG());
            System.out.println("CLP: " + tasas.CLP());

        } catch (Exception e) {
            throw new RuntimeException("Error a obtener tasa de cambio: " + e.getMessage());
        }

        // Instancia de la clase HistorialConversiones para registrar conversiones realizadas
        HistorialConversiones historial = new HistorialConversiones();


        // Menú de opciones para seleccionar tipo de conversión
        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Dolar a Pesos colombiano
                2 - Pesos colombiano a  Dolar
                3 - Dolar a Pesos Argentino
                4 - Pesos Argentino a Dolar
                5 - Dolar a Real Brasileño
                6 - Real Brasileño a Dolar
                7 - Dolar a Bolivian Bolivia
                8 - Bolivian Bolivia a Dolar
                9 - Dolar a Bolivar Soberano venezuela
                10 - Bolivar Soberano venezuela a Dolar
                11 - Dolar a Peso Chileno
                12 - Peso Chileno a Dolar
                13 - Dolar a Sol Peruano
                14 - Sol Peruano a Dolar
                15 - Dolar a Guarani Paraguayo
                16 -  Guarani Paraguayo a Dolar
                17 - salir
                Elija una opcion válida:
                """;

        // Bucle del menú hasta que el usuario decida salir (opción 17)
        while (opcion != 17) {
            System.out.println("*******************************************");
            System.out.println("Bienvenido/a al Conversor de Moneda = ");
            System.out.println(menu);
            opcion = teclado.nextInt();          // Captura la opción ingresada
            double cantidad;

            // Muestra el historial de conversiones previas antes de realizar una nueva
            historial.mostrarHistorial();

            switch (opcion) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16:
                    // Solicita la cantidad de dinero a convertir
                    System.out.println("Cuanto dinero quieres convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("-----------------------------------------------------------------------------------");

                    // Muestra la fecha y hora de la conversión
                    operaciones.fecha();
                    String resultado = "";

                    // Realiza la conversión según la opción seleccionada
                    if (opcion == 1) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.multiplicar(cantidad, tasas.COP()) + " Pesos Colombianos";
                    } else if (opcion == 2) {
                        resultado = "La cantidad de: " + cantidad + " COP, Equivale a: " + operaciones.dividir(cantidad, tasas.COP()) + " Dolares.";

                    } else if (opcion == 3) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.multiplicar(cantidad, tasas.ARS()) + " Pesos Argentino.";
                    } else if (opcion == 4) {
                        resultado = "La cantidad de: " + cantidad + " BRL, Equivale a: " + operaciones.dividir(cantidad, tasas.ARS()) + " Dolares.";
                    } else if (opcion == 5) {
                        resultado = "La cantidad de: " + cantidad + " ARS, Equivale a: " + operaciones.multiplicar(cantidad, tasas.BRL()) + " Real Brasileño ";
                    } else if (opcion == 6) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.dividir(cantidad, tasas.BRL()) + " Dolares";
                    } else if (opcion == 7) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.multiplicar(cantidad, tasas.BOB()) + " Bolivian.";
                    } else if (opcion == 8) {
                        resultado = "La cantidad de: " + cantidad + " BRL, Equivale a: " + operaciones.dividir(cantidad, tasas.BOB()) + " Dolares.";
                    } else if (opcion == 9) {
                        resultado = "La cantidad de: " + cantidad + " ARS, Equivale a: " + operaciones.multiplicar(cantidad, tasas.VES()) + " Bolivares";
                    } else if (opcion == 10) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.dividir(cantidad, tasas.VES()) + " Dolares";
                    } else if (opcion == 11) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.multiplicar(cantidad, tasas.CLP()) + " Pesos Chilenos.";
                    } else if (opcion == 12) {
                        resultado = "La cantidad de: " + cantidad + " BRL, Equivale a: " + operaciones.dividir(cantidad, tasas.CLP()) + " Dolares.";
                    } else if (opcion == 13) {
                        resultado = "La cantidad de: " + cantidad + " ARS, Equivale a: " + operaciones.multiplicar(cantidad, tasas.PEN()) + "  Sol Peruano";
                    } else if (opcion == 14) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.dividir(cantidad, tasas.PEN()) + " Dolares";
                    } else if (opcion == 15) {
                        resultado = "La cantidad de: " + cantidad + " USD, Equivale a: " + operaciones.multiplicar(cantidad, tasas.PYG()) + " Guarani Paraguayo ";
                    } else if (opcion == 16) {
                        resultado = "La cantidad de: " + cantidad + " PYG, Equivale a: " + operaciones.dividir(cantidad, tasas.PYG()) + " Dolares";
                    }

                    // Imprime el resultado de la conversión y agrega al historial
                    System.out.println(resultado);
                    System.out.println("------------------------------------------------------------------------------------");
                    historial.agregarConversion(resultado);
                    break;
                case 17:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no validad");
            }
        }
        // Cierra el scanner y finaliza el programa
        teclado.close();
        System.out.println("Programa terminado");
    }
}