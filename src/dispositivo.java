public class dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: "+ tipo);

// Muestra los demás atributos
    }
    void mostrarActivo(){
        System.out.println("Activo: "+ activo);
    }
}
