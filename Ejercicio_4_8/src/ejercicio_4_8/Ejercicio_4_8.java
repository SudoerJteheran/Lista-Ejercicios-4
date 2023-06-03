/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_8;
import java.util.Scanner;
/**
 *
 * @author Jhojan
 */
public class Ejercicio_4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);

        //Pruebas
        //Crear equipo
        Equipo equipo = new Equipo("Escarabajos del Tolima", "Alemania");
        //Crear ciclistas de varios tipos
        Velocista velocista = new Velocista(1007874758, "Jhojan", 100, 50);
        Contrarrelojista contrarrelojista = new Contrarrelojista(1574254, "Juan", 100);
        Escalador escalador = new Escalador(626546525, "Manuel", 100, 50);
        
        //Agregar ciclistas al equipo
        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(contrarrelojista);
        equipo.añadirCiclista(escalador);
        System.out.println(equipo.listaCiclistas);

        //Agregar los tiempos acumulados de cada ciclista
        velocista.setTiempoAcumulado(451);
        contrarrelojista.setTiempoAcumulado(200);
        escalador.setTiempoAcumulado(501);

        //Probar metodos
        equipo.imprimir();
        equipo.imprimirCiclistas();

        //Buscar ciclista
        System.out.println("Ingrese el nombre del ciclista a buscar: ");
        String nombre = sc.nextLine();
        equipo.buscarCiclista(nombre);



    }

    
}
