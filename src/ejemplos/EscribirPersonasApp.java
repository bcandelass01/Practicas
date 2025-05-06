package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirPersonasApp {

	public static void main(String[] args) {
		// Que escriba los datosde 4 personas
		// FORMATO Fichero:
		// nombre (String) | mayor de edad (boolean) | saldo (double) ...
		// nombre (String) | mayor de edad (boolean) | saldo (double) ...
		
		
		// Nombre del fichero
        String nombreFichero = "personas.txt";

        // Datos de cinco personas
        String[] personas = {
            "Ana López | true | 2500.75",
            "Luis Gómez | false | 134.20",
            "Marta Pérez | true | 320.00",
            "Carlos Ruiz | true | 850.50",
            "Elena Díaz | false | 45.90"
        };
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
            for (String persona : personas) {
                writer.write(persona);
                writer.newLine(); // Salto de línea
            }
            System.out.println("Fichero '" + nombreFichero + "' escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
