
class Contador {
    private int cuenta = 0;

    // Metodo sin sincronizar para provocar el error
    public void incrementar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}

public class seccion2 {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Runnable tarea = () -> {
            for (int i = 0; i < 100; i++) {
                contador.incrementar();
            }
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start();
        h2.start();
// Esperamos a que terminen
        h1.join();
        h2.join();

        System.out.println("Resultado final (con error): " + contador.getCuenta());
    }
}





