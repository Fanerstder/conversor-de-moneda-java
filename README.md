# Conversor de Moneda - Desafío Alura Latam | ONE Next Education

Este proyecto ha sido desarrollado como parte del desafío propuesto por **Alura Latam** en el programa **ONE Next Education**. Se trata de un conversor de moneda en **Java**, el cual consume datos de una API externa para obtener tasas de cambio en tiempo real y permite a los usuarios realizar conversiones dinámicas entre diferentes monedas.

## 📌 Tecnologías utilizadas
- **Java**: Lenguaje de programación principal del proyecto.
- **API REST**: Se consume `ExchangeRate-API` para obtener tasas de conversión en tiempo real.
- **JSON & Gson**: Se parsean datos en formato JSON con la librería `Gson`.
- **Estructuras de datos**: Uso de `ArrayList` para almacenar el historial de conversiones.
- **Bucles & Condicionales**: Implementación de `while`, `switch-case` y `if-else` para lógica de menú y cálculos.
- **Excepciones**: Manejo de errores con `try-catch`, evitando operaciones matemáticas inválidas (ejemplo: división por cero).
- **Java Time API**: Uso de `LocalDate` y `LocalTime` para registrar la fecha y hora de conversión.
- **Scanner**: Captura de entrada del usuario para interactividad.

## 🔧 Funcionalidades
✅ **Obtener tasas de cambio** en tiempo real desde la API.  
✅ **Convertir valores** entre distintas monedas (USD, COP, ARS, BRL, entre otras).  
✅ **Historial de conversiones** almacenadas dinámicamente.  
✅ **Validación de datos**, evitando errores matemáticos como la división por cero.  
✅ **Interfaz basada en consola**, con menús y opciones intuitivas.  

## 📂 Estructura del proyecto


## 📷 Ejemplo de ejecución
Aquí tienes una captura de pantalla del programa en funcionamiento:

![Ejecución del Conversor de Moneda](https://TU_LINK_A_IMAGEN.png)

## 🔗 Enlace al repositorio
Puedes acceder al código fuente en GitHub a través del siguiente enlace:

🔗 [Conversor de Moneda - Faner Santander](https://github.com/Fanerstder/conversor-de-moneda-java.git)

## 🚀 Instalación y ejecución
Para ejecutar este proyecto en tu entorno local:
1. Clona el repositorio:
   ```sh
   git clone https://github.com/Fanerstder/conversor-de-moneda-java.git
