package ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerPersonasApp {

	public static void main(String[] args) {
		// Abre el fichero de personas y muestra el nombre de los mayores de edad
		
		String nombreFichero = "personas.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                // Separar los campos por el separador " | "
                String[] partes = linea.split(" \\| ");
                String nombre = partes[0].trim();
                boolean mayorEdad = Boolean.parseBoolean(partes[1].trim());

                if (mayorEdad) {
                    System.out.println(nombre);
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
	}

}
