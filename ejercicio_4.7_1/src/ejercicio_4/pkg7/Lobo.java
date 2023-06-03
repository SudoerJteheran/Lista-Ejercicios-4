/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.pkg7;

/**
 *
 * @author manue
 */
public class Lobo extends Cánidos {
    /**
* Método que devuelve un String con el sonido de un lobo
* @return Un valor String con el sonido de un lobo: “Aullido”
*/
@Override
    public String getSonido() {
        return "Aullido";
    }
/**
* Método que devuelve un String con los alimentos de un lobo
* @return Un valor String con el tipo de alimentación de un lobo:
* “Carnívoro”
*/
@Override
    public String getAlimentos() {
        return "Carnivoro";
    }
/**
* Método que devuelve un String con el hábitat de un lobo
* @return Un valor String con el hábitat de un lobo: “Bosque”
*/
@Override
    public String getHábitat() {
        return "Bosque";
    }
/**
* Método que devuelve un String con el nombre científico de un lobo
* @return Un valor String con el nombre científico de un lobo:
* “Canis lupus”
*/
@Override
    public String getNombreCientífico() {
        return "Canis lupus";
    }
}
