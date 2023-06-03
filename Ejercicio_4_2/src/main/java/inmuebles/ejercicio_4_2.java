package inmuebles;

public class ejercicio_4_2 {
    public static void main(String[] args) {
        //Variable para lectura de datos

        ApartamentoFamiliar apt1 = new ApartamentoFamiliar(1234523, "Avenida Tricentenario 63-25", 200, 3, 3,2, 500000);
        System.out.println("Datos del apartamento familiar.");
        apt1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apt1.mostrarDatos();


        Apartaestudio aptest = new Apartaestudio(342849, "Calle 4 Carrera 11 4-11",30 , 2 ,1, 2);
        aptest.calcularPrecioVenta(Apartaestudio.valorArea);
        System.out.println("Datos apartaestudio.");
        aptest.mostrarDatos();
    }
}
