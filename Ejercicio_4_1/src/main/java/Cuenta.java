public class Cuenta {
    protected float saldo;
    protected int numConsig = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comiMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        if (cantidad <= 0) {
            return;
        }
        saldo += cantidad; /* Se actualiza el saldo con la cantidad
                            consignada */
        // Se actualiza el número de consignaciones realizadas en la cuenta
        numConsig++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= 0) {
            return;
        }
        float nuevoSaldo = saldo - cantidad;
        /* Si la cantidad a retirar no supera el saldo, el retiro no se puede
        realizar */
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numRetiros++;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12; /* Convierte la tasa anual en
                                            mensual */
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; /* Actualiza el saldo aplicando el interés
                                    mensual */
    }

    public void extractoMensual() {
        saldo -= comiMensual;
        calcularInteres();
    }


}
