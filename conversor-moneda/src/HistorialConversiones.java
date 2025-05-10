import java.util.ArrayList;

/**
 * Clase para almacenar y gestionar el historial de conversiones de monedas.
 */
public class HistorialConversiones {
    // Lista que almacena las conversiones realizadas
    private ArrayList<String> historial;

    /**
     * Constructor de la clase.
     * Inicializa la lista de historial de conversiones.
     */
    public HistorialConversiones() {
        this.historial = new ArrayList<>();
    }

    /**
     * Método para agregar una conversión al historial.
     * @param conversion Cadena de texto que representa la conversión realizada.
     */
    public void agregarConversion(String conversion) {
        historial.add(conversion);
    }

    /**
     * Método para mostrar todas las conversiones almacenadas en el historial.
     * Imprime en consola cada conversión guardada.
     */
    public void mostrarHistorial() {
        System.out.println("\nHistorial de Conversiones:");
        // Recorre la lista y muestra cada conversión registrada
        for (String conversion: historial){
            System.out.println(conversion);
        }
    }
}