package pilarespoo.abstraccion.ejemplovehiculos;

public class Main {

  public static void main(String[] args) {
    Camion camion = new Camion();
    camion.conducir();
    camion.velocidad(50.0);
    camion.moverse();
  }
}
