/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_8;

/**
 *
 * @author Jhojan
 */
public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    //Getters and Setters
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
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
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio: " + velocidadPromedio);
    }

    //Retornar tipo de ciclista
    @Override
    protected String imprimirTipo() {
        return "Es un Velocista";
    }


}
