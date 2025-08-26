package pilarespoo.abstraccion.ejemplovehiculos;

public abstract class Vehiculo {

  private Double velocidad;

  public abstract void velocidad(Double velocidad);

  public abstract void moverse();

  public Double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(Double velocidad) {
    this.velocidad = velocidad;
  }
}
