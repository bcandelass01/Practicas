package ejemplos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		final String FICHERO = "numeros.txt";
		
		// Creo objeto DataInputStrem (filtro para codificarel dato),
		// usando un objeto FileOutputStream
		try(DataInputStream dos = new DataInputStream(new FileInputStream(FICHERO))) {
			// Escribo primero la cabecera
			
			// Escribo todos los números reales
			
		} catch(IOException ioe) {
			System.out.println("ERROR: " + ioe);
		}

	}

}
