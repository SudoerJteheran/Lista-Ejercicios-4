/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhojan
 */
package ejercicio_8_1;
import java.util.*;
public class ListaPersonas {
    Vector ListaPersonas;
    public ListaPersonas(){
        ListaPersonas = new Vector();
    }

    public void añadirPersona(Persona p){
        ListaPersonas.add(p);
    }
    public void eliminarPersona(int i){
        ListaPersonas.remove(i);
    }
    public void borrarLista(){
        ListaPersonas.clear();
    }
}
