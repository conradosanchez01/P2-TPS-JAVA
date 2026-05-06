// Ejercicio 3.1: Checked
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// Ejercicio 3.2: Unchecked
class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo = 1000;
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente en la cuenta");
        }
        saldo -= monto;
    }
}




class Producto {
    public Producto(double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("Precio invalido");
        }
    }
}



public class seccion3 {
    public static void main(String[] args) {
        // Prueba Checked
        CuentaBancaria cuenta = new CuentaBancaria();
        try {
            cuenta.retirar(5);
            System.out.println("Retiro exitoso, no hubo excepcion.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Excepcion Checked: " + e.getMessage());
        }

        // Prueba Unchecked
        Producto p = new Producto(0);
    }
}
