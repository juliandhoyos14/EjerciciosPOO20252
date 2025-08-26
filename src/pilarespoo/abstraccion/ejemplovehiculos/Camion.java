package pilarespoo.abstraccion.ejemplovehiculos;

public class Camion extends Vehiculo implements Terrestre {

  @Override
  public void velocidad(Double velocidad) {
    super.setVelocidad(velocidad);
  }

  @Override
  public void moverse() {
    System.out.println("El camión se mueve a una velocidad de " + super.getVelocidad() + " km/h");
  }

  @Override
  public void conducir() {
    System.out.println("Conduciendo el camión");
  }
}
