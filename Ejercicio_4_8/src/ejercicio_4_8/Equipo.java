/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_8;

import java.util.*;

/**
 *
 * @author Jhojan
 */
public class Equipo {
    private String nombre;
    private static double tiempoTotal;
    private String pais;
    Vector listaCiclistas = new Vector();

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    //Getters and Setters
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected static double getTiempoTotal() {
        return tiempoTotal;
    }
    protected static void setTiempoTotal(double tiempoTotal) {
        Equipo.tiempoTotal = tiempoTotal;
    }
    protected String getPais() {
        return pais;
    }
    protected void setPais(String pais) {
        this.pais = pais;
    }

    //Añadir ciclista
    protected void añadirCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }

    //Imprimir nombres de ciclistas
    protected void imprimirCiclistas(){
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista)listaCiclistas.get(i);
            System.out.println(c.getNombre());
        }
    }
    
    //Suma de tiempos de ciclistas
    protected void sumarTiempos(){
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista)listaCiclistas.get(i);
            tiempoTotal = tiempoTotal + c.getTiempoAcumulado();
        }
    }

    //Buscar ciclista por nombre y imprimir informacion
    protected void buscarCiclista(String nombre){
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista)listaCiclistas.get(i);
            if (c.getNombre().equals(nombre)) {
                c.imprimir();
                c.imprimirTipo();
                return;
            }
        }
        System.out.println("No se encontro el ciclista");
    }

    //Imprimir informacion de equipo
    protected void imprimir(){
        sumarTiempos();
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal);
    }
    
}
