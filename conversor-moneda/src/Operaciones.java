import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que proporciona operaciones matemáticas y muestra la fecha y hora actual.
 */
public class Operaciones {

    /**
     * Método para multiplicar dos números.
     * @param num1 Primer número.
     * @param num2 Segundo número.
     * @return Resultado de la multiplicación.
     */
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    /**
     * Método para dividir dos números con manejo de excepciones.
     * @param num1 Dividendo.
     * @param num2 Divisor.
     * @return Resultado de la división.
     * @throws ArithmeticException Si `num2` es 0, lanza una excepción para evitar error matemático.
     */
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
        return num1 / num2;
    }

    /**
     * Método para mostrar la fecha y hora actual.
     * Imprime en consola la fecha y la hora del sistema.
     */
    public void fecha (){
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        System.out.println("Fecha y hora de Conversion de la moneda: " + fecha + "  " + hora);
    }

}