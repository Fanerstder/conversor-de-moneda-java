

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 * Clase para manejar la conversión de monedas utilizando la API de tasas de cambio.
 */

public class ConversionMoneda {
    // URL base de la API de tasas de cambio
    private static final String direccion = "https://v6.exchangerate-api.com/v6/";
    private String apiKey; // Clave de autenticación para la API
    private HttpClient cliente; // Cliente HTTP para enviar solicitudes
    private HistorialConversiones historial;


    /**
     * Constructor de la clase.
     * @param apiKey Clave de la API para autenticación.
     */

    public ConversionMoneda(String apiKey){
        this.apiKey = apiKey;
        this.cliente = HttpClient.newHttpClient();  // Inicializa el cliente HTTP
        this.historial = new HistorialConversiones(); // Inicializa el historial

    }

    /**
     * Obtiene la tasa de cambio de una moneda base desde la API.
     * @param baseCurrency Código de moneda base (ejemplo: "USD", "EUR").
     * @return Un objeto Divisa con los datos de la tasa de cambio.
     * @throws IOException Si hay un error en la solicitud HTTP.
     * @throws InterruptedException Si la ejecución se interrumpe.
     */

    public Divisa obtenerTasaDeCambio(String baseCurrency) throws IOException, InterruptedException {
        // Construye la URL de solicitud con la API Key y la moneda base
        URI uri = URI.create(direccion + apiKey + "/latest/" + baseCurrency);

        // Crea la solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        // Envía la solicitud y recibe la respuesta como un String
        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());
        // Verifica si la respuesta es exitosa (código 200)
        if (response.statusCode() != 200) {
            throw new IOException("Error en la solicitud HTTP: " + response.statusCode());
        }
        // Parsea el JSON de la respuesta y lo convierte en un objeto JsonObject
        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

        // Extrae los datos JSON y los convierte en un objeto Divisa
        return Divisa.datosJson(jsonObject);
    }
}