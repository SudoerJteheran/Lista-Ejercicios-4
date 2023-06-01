package inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    // Atributo para asignar el valor de administracion
    protected int valorAdm;

    //Constructor
    public ApartamentoFamiliar(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int piso, int valorAdm){
        super(idInmueble, direccion, area, numHabitaciones, numBanos);
        this.valorAdm = valorAdm;
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Valor de administracion: " + valorAdm);
        System.out.println();
    }

}
