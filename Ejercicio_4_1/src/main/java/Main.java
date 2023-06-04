import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial:");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés:");
        float tasaAhorros = input.nextFloat();
        Cuenta_Ahorros cuenta1 = new Cuenta_Ahorros(saldoInicialAhorros, tasaAhorros);

        System.out.print("Ingresar cantidad a consignar:");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);

        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        System.out.println();

        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();


        System.out.println("Cuenta corriente");
        System.out.println("Ingrese saldo inicial:");
        float saldoInicial = input.nextFloat();
        System.out.print("Ingrese tasa de interés:");
        float tasaCorriente = input.nextFloat();
        Cuenta_Corriente cuenta2 = new Cuenta_Corriente(saldoInicial, tasaCorriente);

        System.out.print("Ingresar cantidad a consignar:");
        float cantidad = input.nextFloat();
        cuenta2.consignar(cantidad);

        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRe = input.nextFloat();
        System.out.println();

        cuenta2.retirar(cantidadRe);
        cuenta2.extractoMensual();
        cuenta2.imprimir();
    }
}
