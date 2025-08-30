package pilarespoo.herencia.ejemplovehiculos;

public class Carro extends Vehiculo{

  private String linea;
  private Integer numeroPuertas;

  public Carro(String marca, Integer modelo, Double velocidadMaxima, String linea, Integer numeroPuertas) {
    super(marca, modelo, velocidadMaxima);
    this.linea = linea;
    this.numeroPuertas = numeroPuertas;
  }

  public String getLinea() {
    return linea;
  }

  public Integer getNumeroPuertas() {
    return numeroPuertas;
  }

  public void encenderLimpiaparabrisas() {
    System.out.println("Limpiaparabrisas encendido");
  }

  @Override
  public String toString() {
    return "Carro{" +
        "marca='" + getMarca() + '\'' +
        ", modelo=" + getModelo() +
        ", velocidadMaxima=" + getVelocidadMaxima() +
        ", linea='" + linea + '\'' +
        ", numeroPuertas=" + numeroPuertas +
        '}';
  }
}
