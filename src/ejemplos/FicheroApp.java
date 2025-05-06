package ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicheroApp {

	private static final String FICHERO = "fichero.txt";

	public static void main(String[] args) {
		// ==================================================
		// EJEMPLO: BUFFERREADER
		// Mostrar la primera linea de un fichero de texto
		try(FileReader fichero = new FileReader(FICHERO);
				BufferedReader br = new BufferedReader(fichero)){
			// Muestro la 2ª linea
			String linea = br.readLine();
			linea = br.readLine();
			System.out.println("2ª) " + linea);
			
			// EJERCICIO: Contar las lpalabra de la 2ª linea
			int cont = 0;
			String[] palabras = linea.split("\\s+");
			cont = palabras.length;
			
			System.out.println("Nº de caracteres: " + linea.length());
			System.out.println("Nº de palabras: " + cont);
		} catch(IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}
		
	}
}
