public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");






        System.out.println("Max conexiones (sin crear objeto):"+SistemaGestor.MAX_CONEXIONES); 
        //SistemaGestor.MAX_CONEXIONES = 20; // Esto daría error porque es final


 CuentaBancaria cuenta1 = new CuentaBancaria("12345", 1000);
        System.out.println("Saldo inicial: " + cuenta1.getSaldo() + " - "+"Numero de cuenta:" + cuenta1.getNumeroCuenta()); 
        cuenta1.depositar(500); // Deposito valido
        
        



    // test 
        Reporte rep = new Reporte();
        rep.agregarSecciones("introduccion", "desarrollo", "conclusion");
        rep.agregarSecciones(); // Llamada sin argumentos

        // Prueba encapsulacion
        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000);
        cuenta.depositar(-50); // Debería mostrar error
        
        // Prueba sobrecarga
       Usuario user1 = new Usuario("juan", 25);
        user1.actualizarPerfil("juan@mail.com");
        user1.actualizarPerfil("juan1111@mail.com", 5551234);
       System.out.println("Nombre: " + user1.getNombre() + ", Edad: " + user1.getEdad() + ", Correo: " + user1.getCorreo() + ", Telefono: " + user1.getTelefono());

        

    }
}
