package pilarespoo.herencia.ejemplovehiculos;

public class Vehiculo {

  private String marca;
  private Integer modelo;
  private Double velocidadMaxima;

  public Vehiculo(String marca, Integer modelo, Double velocidadMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
  }

  public String getMarca() {
    return marca;
  }

  public Integer getModelo() {
    return modelo;
  }

  public Double getVelocidadMaxima() {
    return velocidadMaxima;
  }
}
