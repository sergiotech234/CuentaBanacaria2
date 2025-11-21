public class MainCuentaBancaria {
    public static void main(String[] args) {
        Cuentabancaria cuenta = new Cuentabancaria(100);
        //Creamos una excepcion try y catch para que cuando retire dinero y el saldo sea negativo salga un error
        try{
            cuenta.retirar(150);
        }catch (SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
