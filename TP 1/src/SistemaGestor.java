/**
 * La clase SistemaGestor se encarga de administrar las configuraciones
 * centrales de la aplicación, como los límites de conectividad.
 * * @author Conrado
 * @version 1.0
 */
public class SistemaGestor {

    /*
     * Bloque de configuración:
     * Aquí definimos los parámetros constantes que no cambiarán
     * durante la ejecución del programa.
     */
    
    // MAX_CONEXIONES es 'static' porque pertenece a la clase 
    // y 'final' porque su valor es inmutable una vez asignado.
    public static final int MAX_CONEXIONES = 10;

    public void mostrarConfiguracion() {
        // Explicación: Accedemos directamente a la constante de la clase
        System.out.println("El límite máximo de conexiones es: " + MAX_CONEXIONES);
    }

    /* * Nota: Si intentáramos hacer MAX_CONEXIONES = 20; el compilador daría error
     * porque un campo 'final' no puede ser reasignado. Además, al ser 'static',
     * no necesitamos instanciar la clase para acceder a este valor.
     */
}