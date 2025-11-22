//Creamos la clase Cuentabancaria y la variable double
public class Cuentabancaria {
    private double saldo;
    
    public Cuentabancaria(double saldoinicial) {
        this.saldo = saldoinicial;
    }
    //creamos una excepcion en el cual tenemos que decir que si el saldo es negarivo muestre el error
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
    }
    //creamos el get de saldo para que nos muestre la cantidad
    public double getSaldo() {
        return saldo;
    }
}
