package pilarespoo.abstraccion.ejemplofiguras;

public class Circulo extends Figura {

  Double radio;

  public Circulo(Double radio) {
    this.radio = radio;
  }

  @Override
  public Double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
  }
}
