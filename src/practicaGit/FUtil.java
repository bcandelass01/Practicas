package practicaGit;

import java.io.File;

/**
 * @author belen
 */
public class FUtil {

	/**
	 * Este método verifica si el fichero existe en el sistema
	 * @param filename (nomnre del fichero)
	 * @return true/false (dependiendo de si existe o no)
	 */
	public static boolean existe(String filename) {
		if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede estar vacío o solo contener espacios.");
        }

        File file = new File(filename);
        return file.exists();
    }

}
