/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_8;

/**
 *
 * @author Jhojan
 */
abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    abstract String imprimirTipo();
    protected void imprimir(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcumulado);
    }

    //Getters and Setters
    protected String getIdentificador() {
        return identificador;
    }
    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Setters an getters de tiempo acumulado
    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    } 
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

}
