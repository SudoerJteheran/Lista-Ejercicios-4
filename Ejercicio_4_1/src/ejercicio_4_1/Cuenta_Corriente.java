/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1;

/**
 *
 * @author Jteheranm
 */
public class Cuenta_Corriente extends Cuenta{
    // Se agrega el atributo de sobregiro
    private float sobregiro;

    public Cuenta_Corriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
    
    //Método para hacer un retiro de la cuenta
    @Override
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad; //Saldo temporal

        //Si el valor a retirar es mayor al saldo, entonces se asigna a sobregiro
        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad); //Retiro normal si no hay sobregiro
        }

    }

    //Método para el hacer consignas
    @Override
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad; //Saldo temporal
        if (sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro -= residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    //Método para el cálculo hacer el extracto mensual
    @Override
    public void extMensual() {
        super.extMensual();
    }

    public void datos() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Cargo mensual: $" + comiMensual);
        System.out.println("Numero de transacciones: " + numConsig + numRetiros);
        System.out.println("Valor de sobregiro: $" + sobregiro);
        System.out.println();
    }
    
}
