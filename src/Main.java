public class Main{
    public static void main(String[] arg){
        producto producto1 = new producto();
        producto producto2 = new producto();

        producto1.nombre = "Mouse";
        producto1.precio = 25;
        producto1.categoria = "Tecnología";

        producto2.nombre = "Teclado";
        producto2.precio = 35;
        producto2.categoria = "Teclados";

        dispositivo dispositivo1 = new dispositivo();
        dispositivo dispositivo2 = new dispositivo();

        dispositivo1.nombre = "Windows";
        dispositivo1.tipo = "Sistema operativo";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Chrome";
        dispositivo2.tipo = "Navegador";
        dispositivo2.activo = false;

        sensor sensor1 = new sensor();
        sensor sensor2 = new sensor();

        sensor1.nombre = "Sensor A";
        sensor1.tipo = "Temperatura";
        sensor1.lectura = 25.5;

        sensor2.nombre = "Sensor B";
        sensor2.tipo = "Humedad";
        sensor2.lectura = 60;

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarActivo();

        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarActivo();

        sensor1.mostrarInformacion();
        sensor1.mostrarLectura();

        sensor2.mostrarInformacion();
        sensor2.mostrarLectura();


    }
}