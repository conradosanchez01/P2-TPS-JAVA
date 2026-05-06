import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class seccion4 {
    public static void main(String[] args) {
        // Ejercicio 4.1: Try-with-resources
        // solo cierra el BufferedReader al terminar
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error con el archivo: " + e.getMessage());
        }
    }
}
