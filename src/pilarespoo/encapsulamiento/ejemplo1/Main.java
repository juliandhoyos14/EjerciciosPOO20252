package pilarespoo.encapsulamiento.ejemplo1;

public class Main {

  public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria(-1000);


    cuenta.depositar(500);
    cuenta.retirar(100);
    System.out.println("Saldo final: $" + cuenta.getSaldo());
  }
}
