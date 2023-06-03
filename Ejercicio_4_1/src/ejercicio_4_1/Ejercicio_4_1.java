/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_1;
import java.util.Scanner;
/**
 *
 * @author Jteheranm
 */
public class Ejercicio_4_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuenta de ahorros ");
        System.out.println("Ingrese el saldo inicial: ");
        float saldoInicial = entrada.nextFloat();

        System.out.println("Ingrese la tasa de interes anual: ");
        float tasaAnual = entrada.nextFloat();

        Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros(saldoInicial, tasaAnual);

        System.out.println("Ingresar cantidad a consignar: $");

        float cantidadDeposito = entrada.nextFloat();
        cuentaAhorros.consignar(cantidadDeposito);

        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetiro = entrada.nextFloat();

        cuentaAhorros.retirar(cantidadRetiro);
        cuentaAhorros.extMensual();
        cuentaAhorros.datos();

        //Testeamos la cuenta corriente
        System.out.println("Cuenta corriente ");
        System.out.println("Ingrese el saldo inicial: ");
        float saldoInicial2 = entrada.nextFloat();

        System.out.println("Ingrese la tasa de interes anual: ");
        float tasaAnual2 = entrada.nextFloat();

        Cuenta_Corriente cuentaCorriente = new Cuenta_Corriente(saldoInicial2, tasaAnual2);

        System.out.println("Ingresar cantidad a consignar: $");

        float cantidadDeposito2 = entrada.nextFloat();
        cuentaCorriente.consignar(cantidadDeposito2);

        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetiro2 = entrada.nextFloat();

        cuentaCorriente.retirar(cantidadRetiro2);
        cuentaCorriente.extMensual();
        cuentaCorriente.datos();
    }
}
