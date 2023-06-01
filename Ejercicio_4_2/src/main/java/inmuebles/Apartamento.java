package inmuebles;
//Clase para modelar un tipo especifico de inmueble de tipo vivienda
public class Apartamento extends InmuebleVivienda{

    //Constructor de la clase
    public Apartamento(int idInmueble, String direccion, int area, int numHabitaciones, int numBanos){
        super(idInmueble, direccion, area, numHabitaciones, numBanos);
    }

    //Metodos de la clase---------------------------------------------
    void mostrarDatos(){
        super.mostrarDatos();
    }
}
