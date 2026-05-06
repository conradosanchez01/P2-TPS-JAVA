import java.util.List;

public class seccion3 {

        public static void main(String[] args) {
                List<String> nombres = List.of("Juan", "Maria", "Ana");

                // Ejercicio 3.1: Transformacion con Map
                nombres.stream()
                                .map(s -> s.toUpperCase())
                                .forEach(System.out::println);

                // Ejercicio 3.2: Map a tipos primitivos
                int sumaLetras = nombres.stream()
                                .mapToInt(s -> s.length())
                                .sum();
                System.out.println("Suma total de letras: " + sumaLetras);

                // Ejercicio 3.3: Aplanamiento con flatMap
                List<List<String>> datos = List.of(
                                List.of("Juan", "Maria"),
                                List.of("Ana", "Sebastian", "Pedro"));
                long largos = datos.stream()
                                .flatMap(l -> l.stream())
                                .filter(n -> n.length() > 4)
                                .count();
                System.out.println("Nombres con mas de 4 caracteres: " + largos);

                // Ejercicio 3.4: Ordenacion
                System.out.println("Orden natural:");
                nombres.stream().sorted().forEach(System.out::println);

                System.out.println("Orden por longitud:");
                nombres.stream()
                                .sorted((a, b) -> a.length() - b.length())
                                .forEach(System.out::println);
        }
}
