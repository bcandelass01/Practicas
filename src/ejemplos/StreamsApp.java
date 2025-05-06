package ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamsApp {

	public static void main(String[] args) {
		// LECTURA - CARACTERES (la fuente es el teclado)
		// Elijo la clase InputStreamReader
		
		// Creamos la variable
		int car = '?';
		
		// 0) Es obligatorio tratar las excepciones (try/catch)
		try {
			// 1) Creo el stream adecuado
			InputStreamReader streamTeclado = new InputStreamReader(System.in);
			
			// 2) Leo un carácter
			car = streamTeclado.read();
			
			// 3) Cierro stream
			streamTeclado.close();
		} catch(FileNotFoundException file) {
			System.out.println("ERROR: " + file);
		} catch (IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}
		
		// 4) Mostramos por pantalla 
		System.out.printf("Has tecleado %c %n", car);
		
		
		
		// ============================================================
		// EJERCICIO 1: Leer el primer caracter de un fichero de texto
		
		// Es obligatorio tratar las excepciones (try/catch)
		try {
			// Creo el stream lector
			FileReader streamFichero = new FileReader ("fichero.txt");
					
			// Leo un carácter
			car = streamFichero.read();
					
			// Cierro stream
			streamFichero.close();
		} catch (IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}
				
		// Mostramos por pantalla 
		System.out.printf("Hay escrita %c %n", car);
		
		
		
		// ============================================================================
		// EJERCICIO 2: Mostrar en consola todos los caracteres de un fichero de texto
		
		// Creamos un StringBuffer para guardar los caracteres
		StringBuffer cars = new StringBuffer();
		
		// Es obligatorio tratar las excepciones (try/catch)
		try {
			// Creo el stream lector
			FileReader streamFichero = new FileReader ("fichero.txt");
							
			// Leemos los tres primeros caracteres
			for (int i = 0; i < 3; i ++) {
				car = streamFichero.read();
						
				// Añadimos el caracter al StringBuffer
				cars.append((char) car);
			}
						
			// Cierro stream
			streamFichero.close();
		} catch (IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}
						
		// Mostramos por pantalla 
			System.out.printf("Los carácteres escritos son %s %n", cars.toString());
			
			
			
		// ============================================================================
		// EJERCICIO 3: Mostrar en consola todos los caracteres de un fichero de texto
		
		// Creamos un StringBuffer para guardar los caracteres
		StringBuffer cars2 = new StringBuffer();
		// Es obligatorio tratar las excepciones (try/catch)
		try {
			// Creo el stream lector
            FileReader streamFichero = new FileReader("fichero.txt");

            // Leemos todos los caracteres hasta el final del archivo
            while ((car = streamFichero.read()) != -1) {
                cars2.append((char) car);
            }

            // Cierro stream
            streamFichero.close();
		} catch (IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}
							
		// Mostramos por pantalla 
		System.out.printf("Los caracteres escritos son %s %n", cars2.toString());
				
	}
}
