public class Cuentabancaria {
    private double saldo;

    public Cuentabancaria(double saldoinicial) {
        this.saldo = saldoinicial;
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
}
