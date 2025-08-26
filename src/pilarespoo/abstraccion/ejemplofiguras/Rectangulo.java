package pilarespoo.abstraccion.ejemplofiguras;

public class Rectangulo extends Figura {

  Double base;
  Double altura;

  public Rectangulo(Double base, Double altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public Double calcularArea() {
    return base * altura;
  }
}
