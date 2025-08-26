package pilarespoo.abstraccion.cuentabancaria;

public class CuentaBancaria {

  private String tipoCuenta;
  private Long nroCuenta;
  private Double saldo;

  public CuentaBancaria(String tipoCuenta, Long nroCuenta, Double saldo) {
    this.tipoCuenta = tipoCuenta;
    this.nroCuenta = nroCuenta;
    setSaldo(saldo);
  }

  public Double retirarDinero(Double cantidad) {
    if (cantidad <= 0) {
      System.out.println("La cantidad a retirar debe ser mayor que cero.");
      return saldo;
    }
    if (cantidad > saldo) {
      System.out.println("Saldo insuficiente para retirar " + cantidad);
      return saldo;
    }
    saldo -= cantidad;
    return saldo;
  }

  public Double consultarSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    if (saldo < 0) {
      System.out.println("El saldo no puede ser negativo.");
      return;
    }
    this.saldo = saldo;
  }
}
