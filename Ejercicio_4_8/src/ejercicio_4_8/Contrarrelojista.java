/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_8;

/**
 *
 * @author Jhojan
 */
public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    //Getters and Setters
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    //Setters an getters de tiempo acumulado
    protected int getTiempoAcumulado() {
        return super.getTiempoAcumulado();
    } 
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        super.setTiempoAcumulado(tiempoAcumulado);
    }


    //Imprimir informacion
    protected void imprimir(){
        super.imprimir();
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }

    //Retornar tipo de ciclista
    @Override
    protected String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
    
}
