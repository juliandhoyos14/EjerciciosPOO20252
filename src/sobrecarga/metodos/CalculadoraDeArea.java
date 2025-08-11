package sobrecarga.metodos;

public final class CalculadoraDeArea {

  private CalculadoraDeArea() {}

  // Cuadrado
  public static int calcularArea(int lado) {
    return lado * lado;
  }

  // Rectángulo
  public static int calcularArea(int base, int altura) {
      return base * altura;
  }

  // Círculo
  public static double calcularArea(double radio) {
      return Math.PI * radio * radio;
  }
}
