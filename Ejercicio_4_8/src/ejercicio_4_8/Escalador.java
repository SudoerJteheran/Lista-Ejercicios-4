/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_8;

/**
 *
 * @author Jhojan
 */
public class Escalador extends Ciclista{
    private double aceleraionPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double aceleraionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraionPromedio = aceleraionPromedio;
        this.gradoRampa = gradoRampa;
    }

    //Getters and Setters
    protected double getAceleraionPromedio() {
        return aceleraionPromedio;
    }
    protected void setAceleraionPromedio(double aceleraionPromedio) {
        this.aceleraionPromedio = aceleraionPromedio;
    }
    protected double getGradoRampa() {
        return gradoRampa;
    }
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
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
        System.out.println("Aceleracion Promedio: " + aceleraionPromedio);
        System.out.println("Grado de la Rampa: " + gradoRampa);
    }

    //Retornar tipo de ciclista
    @Override
    protected String imprimirTipo() {
        return "Es un Escalador";
    }
}
