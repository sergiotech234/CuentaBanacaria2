public class MainCuentaBancaria {
    public static void main(String[] args) {
        Cuentabancaria cuenta = new Cuentabancaria(100);
        try{
            cuenta.retirar(150);
        }catch (SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}