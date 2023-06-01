package inmuebles;
/**
 * Clase para modelar un tipo especifico de inmueble
 */
public class Casa extends InmuebleVivienda{
    protected int numPisos;

    //Constructor de la clase
    public Casa(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int numPisos){
        super(idInmueble, direccion, area, numHabitaciones, numBanos);
        this.numPisos = numPisos;
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de pisos: " + numPisos);
    }
}
