public class Reporte {

    // Método sin retorno (realiza una accion)
    public void generarEncabezado() {
        System.out.println("=REPORTE DE SISTEMA=");
        System.out.println("Fecha: 14/04/2026");
    }

    // Método con retorno (devuelve un dato)
    public String obtenerCuerpo() {
        return "este es el contenido principal del reporte generado.";
    }

    // Método con argumentos variables (var-args)
    public void agregarSecciones(String... secciones) {
        if (secciones.length == 0) {
            System.out.println("no se agregaron secciones adicionales.");
        } else {
            System.out.println("secciones añadidas:");
            for (String seccion : secciones) {
                System.out.println("- " + seccion);
            }
        }
    }
}