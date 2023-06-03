/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4.pkg7;

/**
 *
 * @author manue
 */
public class Ejercicio_47 {
/**
* Método main que crea un array de varios animales y para cada uno
* muestra en pantalla su nombre científico, su sonido, alimentos y
* hábitat
     * @param args
*/
public static void main(String[] args) {
Animales[] animales; /* Define un array de cuatro
elementos de tipo Animal */
animales = new Animales[4];
animales[0] = new Gato();
animales[1] = new Perro();
animales[2] = new Lobo();
animales[3] = new León();
    for (Animales animale : animales) {
        /* Recorre el array de
        animales */
        System.out.println(animale.getNombreCientífico());
        System.out.println("Sonido: " + animale.getSonido());
        System.out.println("Alimentos: " + animale.getAlimentos());
        System.out.println("Habitat: " + animale.getHábitat());
        System.out.println();
    }
}
}

    
    

