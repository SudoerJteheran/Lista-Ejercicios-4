package inmuebles;

public class CasaRural extends Casa {
    //Atributo que identifica el valor de una casa rural
    protected static double valorArea = 1500000;
    //Distacia a la que se encuentra de la cabecera municipal
    protected int distCab;
    //Atributo que identifica la altura a la que se encuentra la casa
    protected int altitud;

    //Constructor de la clase
    public CasaRural(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos, int numPisos,
            int distCab, int altitud) {
        super(idInmueble, direccion, area, numHabitaciones, numBanos, numPisos);
        this.distCab = distCab;
        this.altitud = altitud;
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Distancia al municipio mas cercano: " + distCab + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud);
        System.out.println();
    }

}
