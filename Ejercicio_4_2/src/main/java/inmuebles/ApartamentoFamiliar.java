package inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    // Atributo para asignar el valor de administracion
    protected double valorAdm;
    // Numero de pisos del apt
    protected int piso;

    //Constructor
    public ApartamentoFamiliar(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int piso, int valorAdm){
        super(idInmueble, direccion, area, numHabitaciones, numBanos);
        this.piso = piso;
        this.valorAdm = valorAdm;
    }

    //Metodos de la clase---------------------------------------------
    @Override
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Valor de administracion: " + valorAdm);
        System.out.println();
    }

}
