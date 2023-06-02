package inmuebles;

public class Inmueble {
    protected int idInmueble;
    protected int area;
    protected String direccion;
    protected double precio;

    //Constructor de la clase
    Inmueble(int idInmueble, String direccion, int area){
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.area = area;
    }

    //Metodos de la clase---------------------------------------------
    //Metodo para calcular el precio de venta
    void calcularPrecioVenta(double valArea){
        this.precio = area * valArea;
    }

    //Metodo que muestra los datos del inmueble
    void mostrarDatos(){
        System.out.println("ID: " + idInmueble);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
        System.out.println("Precio de venta:" + precio);
    }
}
