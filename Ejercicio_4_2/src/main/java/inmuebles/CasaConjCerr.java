package inmuebles;

public class CasaConjCerr extends CasaUrbana {
    protected static double valorArea = 2500000;
    // Atributo para asignar el valor de administracion
    protected double valorAdm;
    protected boolean tienePiscina;
    protected boolean campDeportes;

    //Constructor
    public CasaConjCerr(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int numPisos, int valorAdm, boolean tienePiscina, boolean campDeportes){
        super(idInmueble, direccion, area, numHabitaciones, numBanos, numPisos);
        this.valorAdm = valorAdm;
        this.tienePiscina = tienePiscina;
        this.campDeportes = campDeportes;
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Valor de administracion: " + valorAdm);
        System.out.println("Tiene piscina? " + tienePiscina);
        System.out.println("Tiene campo de deportes? " + campDeportes);
        System.out.println();
    }
}
