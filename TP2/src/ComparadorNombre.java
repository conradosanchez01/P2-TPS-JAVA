import java.util.Comparator;

// 1. Clase separada que implementa Comparator 
class ComparadorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {
        // Definimos lógica alfabética por nombre 
        return e1.nombre.compareTo(e2.nombre);
    }
}