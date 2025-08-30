package pilarespoo.herencia.ejemplovehiculos;

public class Motocicleta extends Vehiculo {

  private Integer tiempos;

  public Motocicleta(String marca, Integer modelo, Double velocidadMaxima, Integer tiempos) {
    super(marca, modelo, velocidadMaxima);
    this.tiempos = tiempos;
  }

  public Integer getTiempos() {
    return tiempos;
  }

  public void picar() {
    System.out.println("La motocicleta esta picando");
  }
}
