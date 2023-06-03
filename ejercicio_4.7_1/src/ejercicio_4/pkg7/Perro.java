/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.pkg7;

/**
 *
 * @author manue
 */
public class Perro extends Cánidos {
    @Override
    public String getSonido() {
        return "Ladrido";
    }
/**
* Método que devuelve un String con los alimentos de un perro
* @return Un valor String con la alimentación de un perro: “Carnívoro”
*/
@Override
    public String getAlimentos() {
        return "Carnivoro";
    }
/**
* Método que devuelve un String con el hábitat de un perro
* @return Un valor String con el hábitat de un perro: “Doméstico”
*/
@Override
    public String getHábitat() {
        return "Domestico";
    }
/**
* Método que devuelve un String con el nombre científico de un perro
* @return Un valor String con el nombre científico de un perro:
* “Canis lupus familiaris”
*/
@Override
    public String getNombreCientífico() {
        return "Canis lupus familiaris";
    }
}
