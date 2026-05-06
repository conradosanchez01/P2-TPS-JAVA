import java.util.stream.Stream;

public class seccion2 {
    
public static void main(String[] args) {
        // Ejercicio 2.1: Creacion y Extraccion
        // distinct para duplicados, skip para saltar el primero, limit para agarrar 3
        long total = Stream.of(2, 5, 3, 3, 6, 2, 4)
                .distinct()
                .skip(1)
                .limit(3)
                .count();
                
        System.out.println("Total de elementos: " + total);

        // Ejercicio 2.2: Filtrado y Procesamiento Intermedio
        // filter para mayores a 3 y peek para ver como fluye

        System.out.println("Valores en el pipeline:");

        long count = Stream.of(1, 4, 2, 8, 5)
                .filter(s -> s > 3)
                .peek(n -> System.out.println("Paso el filtro: " + n))
                .count();

        System.out.println("Cantidad mayores a 3: " + count);
    }
}
