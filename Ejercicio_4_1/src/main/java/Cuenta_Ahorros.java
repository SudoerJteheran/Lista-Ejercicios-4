public class Cuenta_Ahorros extends Cuenta{
    private boolean activa;

    public Cuenta_Ahorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000){
            activa = false;
        } else {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (activa) // Si la cuenta está activa, se puede retirar dinero
            super.retirar(cantidad); /* Invoca al método retirar de la clase
                                     padre */
    }

    public void consignar(float cantidad) {
        if (activa) // Si la cuenta está activa, se puede consignar dinero
            super.consignar(cantidad); /* Invoca al método consignar de la clase
                                        padre */
    }


    public void extractoMensual() {
    /* Si la cantidad de retiros es superior a cuatro, se genera una
    comisión mensual */
        if (numRetiros > 4) {
            comiMensual += (comiMensual - 4) * 1000;
        }
        super.extractoMensual(); // Invoca al método de la clase padre
        /* Si el saldo actualizado de la cuenta es menor a 10000, la
        cuenta no se activa */
        if ( saldo < 10000 )
            activa = false;
    }

    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comision mensual = $" + comiMensual);
        System.out.println("Número de transacciones = " + (numConsig + numRetiros));
        System.out.println();
    }

}
