public class Empleado implements Comparable<Empleado>{
    


    String nombre;
    int edad;


    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


// 2. Sobrescribimos compareTo para ordenar por edad 
    @Override
    public int compareTo(Empleado otro) {
        // Devuelve: 0 si son iguales, 1 si es mayor, -1 si es menor
        return Integer.compare(this.edad, otro.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }












    
}
