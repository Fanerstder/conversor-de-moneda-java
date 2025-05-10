import com.google.gson.JsonObject;

/**
 * Record que representa las tasas de cambio de diferentes monedas.
 * Cada atributo almacena la tasa de conversión desde la moneda base.
 */
public record Divisa(double USD,
                     double COP,
                     double ARS,
                     double BOB,
                     double BRL,
                     double CLP,
                     double VES,
                     double PYG,
                     double PEN) {
    /**
     * Método para convertir un objeto JSON en una instancia de Divisa.
     * @param jsonObject Objeto JSON con tasas de cambio.
     * @return Instancia de Divisa con valores extraídos del JSON.
     */
    public static Divisa datosJson(JsonObject jsonObject){
        // Extrae el objeto que contiene las tasas de cambio
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        // Crea una nueva instancia de Divisa con las tasas de conversión
        return new Divisa(
                rates.get("USD").getAsDouble(), // Moneda dolar
                rates.get("COP").getAsDouble(), // Moneda de Colombia
                rates.get("ARS").getAsDouble(), // Moneda de argentina
                rates.get("BOB").getAsDouble(), // Moneda de bolivia
                rates.get("BRL").getAsDouble(), // Moneda de brasil
                rates.get("CLP").getAsDouble(), //Moneda de chille
                rates.get("VES").getAsDouble(), // Moneda de venezuela
                rates.get("PYG").getAsDouble(), // Moneda de paraguay
                rates.get("PEN").getAsDouble() // Moneda de peru

        );
    }
}