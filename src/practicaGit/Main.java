package practicaGit;

public class Main {
	public static void main(String[] args) {
        try {
            System.out.println(FUtil.existe("archivo.txt"));
            System.out.println(FUtil.existe("   "));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}