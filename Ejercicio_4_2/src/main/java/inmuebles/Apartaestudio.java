package inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;

    //Constructor
    public Apartaestudio(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int piso){
        super(idInmueble, direccion, area, 1,1);
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println();
    }
}
