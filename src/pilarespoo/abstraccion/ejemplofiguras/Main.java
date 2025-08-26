package pilarespoo.abstraccion.ejemplofiguras;

public class Main {

  public static void main(String[] args) {
    Figura circulo = new Circulo(5.0);
    Figura rectangulo = new Rectangulo(4.0, 6.0);

    System.out.println("Área del círculo: " + circulo.calcularArea());
    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
  }
}
