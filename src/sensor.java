public class sensor {
    public String nombre;
    String tipo;
    public double lectura;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: "+ tipo);

// Muestra los demás atributos
    }
    void mostrarLectura(){
        System.out.println("Activo: "+ lectura);
    }
}
