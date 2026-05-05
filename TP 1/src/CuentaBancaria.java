public class CuentaBancaria {
    // Atributos privados: nadie fuera de esta clase puede verlos o tocarlos
    // directamente
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
   public String getNumeroCuenta() {
        return numeroCuenta;
    }
    // Método público para obtener el saldo (solo lectura)
    public double getSaldo() {
        return saldo;
    }

    // Método con lógica de validación (Interfaz segura)
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            // Protección de integridad: no permitimos valores negativos
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }
}