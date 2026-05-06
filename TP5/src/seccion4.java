public class seccion4 {
    public static void main(String[] args) throws InterruptedException {

        // Ejercicio 4.1: Identidad y Prioridades
        Runnable tareaPrioridad = () -> {
            System.out.println("Hilo: " + Thread.currentThread().getName() +
                    " - Prioridad: " + Thread.currentThread().getPriority());
        };

        Thread hp1 = new Thread(tareaPrioridad, "Hilo_Baja");
        Thread hp2 = new Thread(tareaPrioridad, "Hilo_Alta");

        hp1.setPriority(1); // Prioridad minima
        hp2.setPriority(10); // Prioridad maxima

        hp1.start();
        hp2.start();
        Thread.sleep(1000);

        // Ejercicio 4.2: Espera e Interrupcion
        Thread hiloLargo = new Thread(() -> {
            try {
                System.out.println("Hilo largo: Trabajando por 10 seg");
                Thread.sleep(10000);
                System.out.println("Hilo largo: Tarea terminada con exito.");
            } catch (InterruptedException e) {
                // Se produce una excepcion si el hilo es interrumpido
                System.out.println("Hilo largo: Fue interrumpido mientras esperaba");
            }
        });

        hiloLargo.start();

        // El join() detiene el hilo main hasta que el hilo en uso termine

        // hiloLargo.join(); // Descomentar para probar el join()

        // Probar el interrupt()
        Thread.sleep(2000);
        System.out.println("Hilo main: Interrumpiendo el hilo largo con interrupt...");
        hiloLargo.interrupt();
    }
}