/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1;

/**
 *
 * @author Jteheranm
 */
public class Cuenta {
    //Creamos los atributos, protegidos
    protected float saldo;
    protected int numConsig = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comiMensual = 0;
    
    //Constructor de la clase
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    //Método para asignar la consignación
    public void consignar(float cantidad) {
        saldo += cantidad;
        //Actualiza el # de consignaciones en 1
        numConsig += 1;
    }
    
    //Método para hacer un retiro de la cuenta
    public void retirar(float cantidad) {
        //Se verifica que la cantidad no exceda el saldo actual
        if (saldo - cantidad >= 0 ) {
            saldo -= cantidad;
            //Actualizamos # de retiros
            numRetiros += 1;
        } else {
            System.out.println("No se cuenta con saldo suficiente para el monto a retirar");
        }
    }
    //Método para el cálculo del interés
    public void calInteres() {
        //Calculamos la tasa mensual
        float tasaMensual = tasaAnual/12;
        float intMensual = saldo * tasaMensual;
        saldo += intMensual;
    }
    public void extMensual() {
        saldo -= comiMensual;
        calInteres();
    }
    
}
