// Ejercicio 1.1: Extendiendo Thread
class TareaHilo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Numero: " + i);
        }
    }
}

// Ejercicio 1.2: Implementando Runnable
class TareaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Runnable) - Numero: " + i);
        }
    }
}
public class seccion1 {
    public static void main(String[] args) {
        // Ejecucion Ejercicio 1.1
        TareaHilo h1 = new TareaHilo();
        TareaHilo h2 = new TareaHilo();
        h1.setName("Hilo_1");
        h2.setName("Hilo_2");
        
        h1.start(); // Se usa start para que sea concurrente
        h2.start();

        // Ejecucion Ejercicio 1.2
        TareaRunnable tarea = new TareaRunnable();
        Thread h3 = new Thread(tarea, "Hilo_3");
        h3.start();
    }
}
