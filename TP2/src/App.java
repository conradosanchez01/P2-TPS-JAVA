import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
public class App {

    public static void main(String[] args) throws Exception {

  //1.1(Creación, actualización y recuperación): 

    //    if (false) {
    //         System.out.println("Hello, World!");

    //         int[] numeros = new int[5];
    //         numeros[0] = 10;
    //         numeros[1] = 20;
    //         numeros[2] = 30;
    //         numeros[3] = 40;
    //         numeros[4] = 50;

    //         System.out.println("Lista de numeros:");
    //         for (int j : numeros) {
    //             System.out.print(j + " ");
    //         }
    //         numeros[2] = 60; // reemplaza en la tercera posicion el 30 x el 60
    //         numeros[3] = 0;
    //         /*
    //          * no se puede eliminar un elemento de un array,
    //          * pero se puede reemplazar por otro valor, en este caso el 0
    //          * si fuera un objeto se podria reemplazar por null
    //          */

    //         System.out.println("\nLista de numeros actualizada:");
    //         for (int j : numeros) {
    //             System.out.print(j + " ");
    //         }

    //         System.out.println("\nCantidad de espacios dentro del array: " + numeros.length);

    //         /*
    //          * para acceder al ultimo elemento del array se resta 1 a la
    //          * cantidad de espacios del array,sino se va de rango 0,1,2,3,4
    //          */
    //         int ultimoEspacio = numeros[numeros.length - 1];
    //         System.out.println("Ultimo numero del array: " + ultimoEspacio);

     //}

// Para comentar:  Ctrl+K y luego Ctrl+C
// Para descomentar:  Ctrl + K y luego Ctrl + U. saca solo si el comentario esta hecho al principio de la linea.

//Ejercicio 1.2 (Ordenamiento y Búsqueda):
        // String[] nombres = { "Zoe1", "Maria2", "Juan3", "Pedro4" };

        // System.out.println("\nLista de nombres:");
        //     for (String nombre : nombres) {
        //         System.out.println(nombre);
        //     }

        // Arrays.sort(nombres);

        // System.out.println("\nLista de nombres actualizada:");
        //     for (String nombre : nombres) {
        //         System.out.println(nombre);
        //     }


     // buscar la posición de un nombre específico dentro del arreglo


    // String nombreABuscar = "Juan3";
    // int posicion = Arrays.binarySearch(nombres, nombreABuscar);

    // if (posicion >= 0) {
    // System.out.println("\n El nombre '" + nombreABuscar + "' se encuentra en la posicion: " + posicion);
    // } else {
    //     System.out.println("\n El nombre '" + nombreABuscar + "' no fue encontrado.");
    // }

// //2.1

// List<String> tareas = new ArrayList<>();

// //crear 3 elemnetos create
//         tareas.add("Estudiar Java");
//         tareas.add("Lavar el auto");
//         tareas.add("Ir al gimnasio");

// // 2 actualizar valor Update

//          tareas.set(1, "Detallar el auto");


// // 3 read
// String primeraTarea = tareas.get(0);
//         System.out.println("Primera tarea: " + primeraTarea);


// // 4 eliminar delete el ultimo de la lista
//         tareas.remove(tareas.size() - 1);

// System.out.println("\nLista de tareas actualizada:");
//         for (String tarea : tareas) {
//             System.out.println(tarea);
//         }


// //2.2
// //inmutable vs linkedlist

// //creo lista inmutable con List.of()
// List<String> fija = List.of("Item A", "Item B", "Item C");

// // 2 Intenta agregar un elemento a la lista inmutable y manejar la excepcion) no se puede modificar
//         try {
//             fija.add("Item D");
//         } catch (UnsupportedOperationException e) {
//             System.out.println("Error esperado: No se puede modificar una lista inmutable.");
//         }

// //3 pasa la lista inmutable al constructor de un LinkedList para hacerla mutable
//         LinkedList<String> mutable = new LinkedList<>(fija);

// //4  LisnkedList permite insetar en el medio de la lista mutable
//         mutable.add(1, "Item Nuevo");
// System.out.println("Lista mutable con inserción: " + mutable);



// //Sección 3: Conjuntos (Sets) y Colecciones Deque
// //3.1

// //Objetivo: Manipular colecciones sin duplicados y colas de doble extremo.

// // Hashset de tipo Integer para almacenar numeros enteros sin duplicados
//  Set<Integer> conjunto = new HashSet<>();

//  // 2. Intento de insertar el mismo número tres veces
//     conjunto.add(5); conjunto.add(5); conjunto.add(5);

//     // 3. Verificación de tamaño
//     System.out.println("Tamaño (debe ser 1): " + conjunto.size());


// //HashSet: No admite duplicados y no garantiza el orden de los elementos.

// // 4. Comprobar existencia y eliminar

//  if (conjunto.contains(5)) {
//     System.out.println("El número 5 está presente en el conjunto.");
//     conjunto.remove(5);

//  }
//     System.out.println("Tamaño : " + conjunto.size());

//  conjunto.add(3); conjunto.add(2); conjunto.add(4);

// System.out.println("Tamaño : " + conjunto.size());

// System.out.println("Elementos en el conjunto: " + conjunto);
// //los imprime en orden aleatorio, no se garantiza el orden de los elementos en un HashSet, aunque a mi me salen ordenados, supongo que es porque son nuemros enteros



// //3.2
// // 1. Crear la colección ArrayDeque
// Deque<String> miDeque = new ArrayDeque<>();

// // 2. Agregar elementos a ambos extremos
// miDeque.addFirst("Elemento 1");
// miDeque.addLast("Elemento 2");   

// // 3. Recuperar y eliminar de los extremos
// String primero = miDeque.removeFirst();  
// String ultimo = miDeque.removeLast();   

// System.out.println("Eliminado del inicio: " + primero);
// System.out.println("Eliminado del final: " + ultimo);

// // 4. Verificar si el Deque está vacío
// System.out.println("¿El Deque está vacío? " + miDeque.isEmpty());


// //4.1

// // 1 Crear el HashMap (ID Integer -> Nombre String)
// Map<Integer, String> usuarios = new HashMap<>();

// // 2 Agregar nuevas entradas usando put()
// usuarios.put(101, "Lucas");
// usuarios.put(102, "Ana");
// usuarios.put(103, "Roberto"); 

// // 3. Recuperar un nombre pasando su ID al método get()
// String nombreEncontrado = usuarios.get(102);
// System.out.println("Usuario con ID 102: " + nombreEncontrado); 

// // 4. Actualizar un nombre existente con replace()
// usuarios.replace(103, "Roberto Carlos"); 
// System.out.println("Usuario con ID 103 actualizado: " + usuarios.get(103));

// // 5. Eliminar un registro pasando la clave al método remove()
// usuarios.remove(101); 
// System.out.println("Usuario con ID 101 eliminado. ¿Existe? " + usuarios.get(101));



//  //4.2
//  //A diferencia del anterior, el TreeMap ordena automáticamente 
//  // los elementos según el orden natural de sus claves 
//  // (en este caso, de menor a mayor por el ID). 
//  // Esto significa que al imprimir el TreeMap, los usuarios aparecerán
//  //  ordenados por su ID, mientras que en el HashMap no se garantiza
//  //  ningún orden específico.

// // 1. Instanciar un TreeMap
// Map<Integer, String> mapaOrdenado = new TreeMap<>();
// mapaOrdenado.put(50, "Zulema");
// mapaOrdenado.put(10, "Alberto");
// mapaOrdenado.put(30, "Monica"); 

// // 2. Obtener todas las claves y recorrerlas
// System.out.println("\nRegistros ordenados por ID:");
// for (Integer id : mapaOrdenado.keySet()) {
//     // 3. Observar cómo se recuperan ordenados ascendentemente por la clave
//     System.out.println("ID: " + id + " - Nombre: " + mapaOrdenado.get(id));
// } 


//5.1 Orden natural con Comparable


List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Zoe", 35));
        listaEmpleados.add(new Empleado("Ana", 25));
        listaEmpleados.add(new Empleado("Carlos", 40));

        // Orden Natural (por edad - Comparable) 
        Collections.sort(listaEmpleados);
        System.out.println("Ordenado por edad (Natural): " + listaEmpleados);

//5.2
     // Orden Personalizado (por nombre - Comparator) 
        Collections.sort(listaEmpleados, new ComparadorNombre());


        System.out.println("Ordenado por nombre (Personalizado): " + listaEmpleados);












    }
}
