package inmuebles;

public class CasaIndep extends CasaUrbana{
    protected static double valorArea = 3000000;

    //Constructor
    public CasaIndep(int idInmueble, int area, String direccion, int numBanos, int numHabitaciones, int numPisos) {
        super(idInmueble, direccion, area, numHabitaciones, numBanos, numPisos);
    }

    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println();
    }
}
