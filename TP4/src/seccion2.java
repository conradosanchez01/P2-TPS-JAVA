public class seccion2 {
    public static void main(String[] args) {
        // Ejercicio 2.2: Captura especifica
        try {
            registrarUsuario("", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
        try {
            registrarUsuario("dani", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }

    // Ejercicio 2.1: Metodo registrar con throw
    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Usuario registrado: " + nombre);
    }
}
