class ContadorSincro {
    private int cuenta = 0;

    // // Ejercicio 3.1: Metodo sincronizado
    // public synchronized void incrementar() {
    //     cuenta++;
    // }

    // Ejercicio 3.2: Bloque sincronizado 
    public void incrementar() {
        synchronized(this) {
            cuenta++;
        }
    }

    public int getCuenta() {
        return cuenta;
    }
}

public class seccion3 {
    public static void main(String[] args) throws InterruptedException {
        ContadorSincro contador = new ContadorSincro();

        Runnable tarea = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start();
        h2.start();

        h1.join(); 
        h2.join();

        System.out.println("Resultado final (correcto): " + contador.getCuenta());
    }
}