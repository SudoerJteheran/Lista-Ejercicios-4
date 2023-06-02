package inmuebles;

public class Oficina extends Local {
    //Tipo de locar con valor con area
    //y booleano para determinar si es gubernamental
    protected static double valorArea = 3500000;
    protected boolean gubernam;

    //Constructor de la clase
    public Oficina(int idInmoviliario, int area, String direccion, tipo tipoLocal, boolean gubernam) {
        super(idInmoviliario, area, direccion, tipoLocal);
        this.gubernam = gubernam;
    }

    //Metodos de la clase----------------------
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Es oficina del gobierno: " + gubernam);
        System.out.println();
    }
}
