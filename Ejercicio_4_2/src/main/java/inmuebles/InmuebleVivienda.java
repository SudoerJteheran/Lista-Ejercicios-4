package inmuebles;

/**
 * Clase que representa un inmueble de tipo vivienda
 * con atributos como # de habitaciones y # de baños
 */
public class InmuebleVivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;

    //Constructor de la clase
    public InmuebleVivienda(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos){
        super(idInmueble, direccion, area);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de baños: " + numBanos);
        System.out.println("Precio de venta:" + precio);
    }
}
