/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.pkg7;

public class Gato extends Felino {
/**
* Método que devuelve un String con el sonido de un gato
* @return Un valor String con el sonido de un gato: “Maullido”
*/
 @Override
public String getSonido() {
return "Maullido";
}
/**
* Método que devuelve un String con los alimentos de un gato
* @return Un valor String con la alimentación de un gato: “Ratones”
*/
@Override
public String getAlimentos() {
return "Ratones";
}
/**
* Método que devuelve un String con el hábitat de un gato
* @return Un valor String con el hábitat de un gato: “Doméstico”
*/
@Override
public String getHábitat() {
return "Domestico";
}
/**
* Método que devuelve un String con el nombre científico de un gato
* @return Un valor String con el nombre científico de un gato:
* “Felis silvestris catus”
*/
@Override
public String getNombreCientífico() {
return "Felis silvestris catus";
}
}
