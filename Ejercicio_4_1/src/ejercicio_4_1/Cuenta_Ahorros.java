/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4_1;

/**
 *
 * @author Jteheranm
 */
//Se extiende como una subclase de Cuenta
public class Cuenta_Ahorros extends Cuenta{
    private boolean activa;
    
    //Constructor de la clase
    public Cuenta_Ahorros(float saldo, float tasaAnual){
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
        // Así establecemos el valor bool del atributo
    }
    
    //Sobreescribimos el método retirar, con la condicion de activa
    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }
    
    //Sobreescribimos el método consignar, con la condicion de activa
    @Override
    public void consignar(float cantidad){
        if (activa) {
            super.consignar(cantidad);
        }
    }
    /*Sobreescribimos el método extMensual, el cual 
    se activa si los retiros son mayores que 4
    */
    @Override
    public void extMensual(){
        if (numRetiros > 4){
            comiMensual += (numRetiros - 4) * 1000;
        }
        super.extMensual();
        /* Si el saldo actualizado es menor que 10000, 
        la cuenta deja de estar activa */
        if (saldo < 10000) {
            activa = false;
        }
    }
    
    /*Método propio de la subclase 
    para mostrar los datos de la cuenta*/
    public void datos() {
        System.out.println("Sado = $" + saldo);
        System.out.println("Comisión mensual: $" + comiMensual);
        System.out.println("Número de transacciones: " + (numRetiros + numConsig));
        System.out.println();
    }
}
