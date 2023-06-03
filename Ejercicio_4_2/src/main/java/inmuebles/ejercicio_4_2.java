package inmuebles;

public class ejercicio_4_2 {
    public static void main(String[] args) {
        //Testeamos todos las clases y mostramos los datos de cada uno

        ApartamentoFamiliar apt1 = new ApartamentoFamiliar(1234523, "Avenida Tricentenario 63-25", 80, 3, 3,2, 500000);
        System.out.println("Datos del apartamento familiar.");
        apt1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apt1.mostrarDatos();


        Apartaestudio aptest = new Apartaestudio(342849, "Calle 4 Carrera 11 4-11",34 , 2 ,1, 2);
        aptest.calcularPrecioVenta(Apartaestudio.valorArea);
        System.out.println("Datos apartaestudio.");
        aptest.mostrarDatos();

        LocalComercial local = new LocalComercial(234455, 56, "Calle 80 Carrera 22 56-31", Local.tipo.INTERNO, "El Retorno");
        local.calcularPrecioVenta(LocalComercial.valorArea);
        System.out.println("Datos local comercial.");
        local.mostrarDatos();

        Oficina oficina = new Oficina(453345, 20, "Calle 98 Carrera 11 3-15", Local.tipo.CALLE, false);
        oficina.calcularPrecioVenta(Oficina.valorArea);
        System.out.println("Datos oficina.");
        oficina.mostrarDatos();

        CasaRural casa1 = new CasaRural(57869, "Avenida Los Colores 4-11", 180, 3, 2, 1, 10, 205);
        casa1.calcularPrecioVenta(CasaRural.valorArea);
        System.out.println("Datos casa rural.");
        casa1.mostrarDatos();

        CasaConjCerr casa2 = new CasaConjCerr(546234, "Calle 4 Carrera 11 4-11", 110, 4, 2, 2, 500000, true, true);
        casa2.calcularPrecioVenta(CasaConjCerr.valorArea);
        System.out.println("Datos casa conjunto cerrado.");
        casa2.mostrarDatos();

        CasaIndep casa3 = new CasaIndep(9879679, 150,"Calle 4 Carrera 11 4-11", 3, 6, 3);
        casa3.calcularPrecioVenta(CasaIndep.valorArea);
        System.out.println("Datos casa independiente.");
        casa3.mostrarDatos();
    }
}
