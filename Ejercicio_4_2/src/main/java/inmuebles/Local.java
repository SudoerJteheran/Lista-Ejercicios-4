package inmuebles;

public class Local extends Inmueble {
    enum tipo {INTERNO,CALLE}; //Tipo de mueble especificado
    protected tipo tipoLocal; //Atributo para identificar el tipo

    //Constructor
    public Local(int idInmobiliario, int area, String direccion, tipo tipoLocal){
        super(idInmobiliario, direccion, area);
        this.tipoLocal = tipoLocal;
    }

    //Metodos de la clase-----------------------------------------


    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
