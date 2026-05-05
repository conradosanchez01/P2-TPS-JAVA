public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    // --- Sobrecarga de Constructores ---

    // 1 Constructor por defecto sin param
    public Usuario() {
        this.nombre = "Anonimo";
    }

    // 2 Constructor con un parametro
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // 3 Constructor con dos parámetros
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getCorreo() {
        return correo;
    }public int getTelefono() {
        return telefono;
    }
    
    // ---Sobrecarga de Metodos

    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Correo actualizado: " + correo);
    }

    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
      System.out.println("Correo y telefono actualizados. Correo: " + correo + ", Telefono: " + telefono);
    }
}