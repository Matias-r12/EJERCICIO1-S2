public class producto {
    public String nombre;
    public double precio;
    String categoria;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: "+ precio);
// Muestra los demás atributos
    }
    void mostrarCategoria(){
        System.out.println("Activo: "+ categoria);
    }
}

