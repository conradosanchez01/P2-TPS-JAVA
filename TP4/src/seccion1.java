public class seccion1 {
    public static void main(String[] args) {
        // Ejercicio 1.1: Convertir "abc" a numero
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass().getName());
        }

        // Ejercicio 1.2: Division por cero y finally
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } finally {
            System.out.println("Limpieza final");
        }

        // Ejercicio 1.3: Multi-catch
        try {
            String entrada = "0"; // Proba con "abc" o "0" para ver los errores
            int n = Integer.parseInt(entrada);
            int res = 100 / n;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de calculo o conversion");
        }
    }
}