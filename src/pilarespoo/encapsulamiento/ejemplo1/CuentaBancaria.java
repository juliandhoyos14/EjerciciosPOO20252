package pilarespoo.encapsulamiento.ejemplo1;

public class CuentaBancaria {

  private double saldo;

  public CuentaBancaria(double saldoInicial) {
    if (saldoInicial < 0) {
      this.saldo = 0;
    } else {
      this.saldo = saldoInicial;
    }
  }

  public void depositar(double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
      System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
    } else {
      System.out.println("Cantidad no válida.");
    }
  }

  public void retirar(double cantidad) {
    if (cantidad > 0 && cantidad <= saldo) {
      saldo -= cantidad;
      System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    } else {
      System.out.println("Fondos insuficientes o cantidad inválida.");
    }
  }

  // Getter para obtener el saldo (pero no modificarlo)
  public double getSaldo() {
    return saldo;
  }
}
