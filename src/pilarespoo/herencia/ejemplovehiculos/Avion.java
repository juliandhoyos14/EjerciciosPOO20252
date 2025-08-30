package pilarespoo.herencia.ejemplovehiculos;

public class Avion extends Vehiculo implements Volador {

  private Integer numeroMotores;

  public Avion(String marca, Integer modelo, Double velocidadMaxima, Integer numeroMotores) {
    super(marca, modelo, velocidadMaxima);
    this.numeroMotores = numeroMotores;
  }

  public Integer getNumeroMotores() {
    return numeroMotores;
  }

  @Override
  public void volar() {
    System.out.println("El avion esta volando");
  }
}
