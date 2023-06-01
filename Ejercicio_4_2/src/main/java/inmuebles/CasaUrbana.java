package inmuebles;

public class CasaUrbana extends Casa{
    //Constructor
    public CasaUrbana(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int numPisos){
        super(idInmueble, direccion, area, numHabitaciones, numBanos, numPisos);
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos(){
        super.mostrarDatos();
    }
}
