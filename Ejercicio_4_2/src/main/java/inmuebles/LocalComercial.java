package inmuebles;

public class LocalComercial extends Local {

    //Modela un tipo especifico de Local
    //Agrega atributos como valor por area y centro al que pertenece

    //Valor por area del local
    protected static double valorArea = 3000000;
    protected String centroComer:

    //Constructor
    public LocalComercial(int idInmobiliario, int area, String direccion, tipo tipoLocal, String centroComer) {
        super(idInmobiliario, area, direccion, tipoLocal);
        this.centroComer = centroComer;
    }

    //Metodos de la clase------------------------------------------------
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Centro comercial: " + centroComer);
        System.out.println();
    }
}
