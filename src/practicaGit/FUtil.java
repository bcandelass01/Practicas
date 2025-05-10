package practicaGit;

import java.io.File;

public class FUtil {

	public static boolean existe(String filename) {
		if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede estar vacío o solo contener espacios.");
        }

        File file = new File(filename);
        return file.exists();
    }

}
