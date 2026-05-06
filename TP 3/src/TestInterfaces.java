import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class TestInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println("¿Es 10 par?: " + esPar.test(10));

        Function<String, Integer> longitud = s -> s.length();
        System.out.println("Longitud de 'Java': " + longitud.apply("Java"));

        Consumer<Integer> imprimir = n -> System.out.println("Numero recibido: " + n);
        imprimir.accept(21);

        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println("Random: " + aleatorio.get());

        // 1.2 Comparator
        List<String> textos = new ArrayList<>(List.of("java", "stream", "codear", "ia"));
        textos.sort((a, b) -> a.length() - b.length());
        System.out.println("ordenados por longitud: " + textos);

        // 1.3 Variantes Primitivas
        IntPredicate esParPrimitivo = n -> n % 2 == 0;
        ToIntFunction<String> longitudPrimitiva = s -> s.length();

        System.out.println("Primitivo Par (8): " + esParPrimitivo.test(8));
        System.out.println("Primitivo Longitud: " + longitudPrimitiva.applyAsInt("hola"));
    }
}