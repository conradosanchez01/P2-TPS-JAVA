import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class seccion4 {
        public static void main(String[] args) {
                // Ejercicio 4.1: Comprobaciones logicas
                List<Integer> lista = List.of(2, 5, 7, 3, 6, 2, 3);

                System.out.println("Hay alguno > 5?: " + lista.stream().anyMatch(n -> n > 5));
                System.out.println("Todos son > 0?: " + lista.stream().allMatch(n -> n > 0));
                System.out.println("Ninguno es negativo?: " + lista.stream().noneMatch(n -> n < 0));

                // Ejercicio 4.2: Busqueda y Clase Optional
                Optional<Integer> primeroPar = lista.stream()
                                .filter(n -> n % 2 == 0)
                                .findFirst();

                if (primeroPar.isPresent()) {
                        System.out.println("Primer par encontrado: " + primeroPar.get());
                }

                // Ejercicio 4.3: Reduccion
                Optional<Integer> suma = lista.stream().reduce((a, b) -> a + b);
                System.out.println("Suma total: " + suma.get());

                // Ejercicio 4.4: Reduccion a Coleccion
                List<Integer> limpia = Stream.of(1, 2, 2, 3, 3, 4)
                                .distinct()
                                .collect(Collectors.toList());
                System.out.println("Lista limpia de duplicados: " + limpia);
                List<Persona> personas = List.of(
                                new Persona("123", "Carlos"),
                                new Persona("456", "Marta"));
                Map<String, String> mapaPersonas = personas.stream()
                                .collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre()));

                System.out.println("Mapa: " + mapaPersonas);
        }
}
