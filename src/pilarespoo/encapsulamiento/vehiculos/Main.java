package pilarespoo.encapsulamiento.vehiculos;

public class Main {

  public static void main(String[] args) {
    Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2005, 15000.0);

    System.out.println(vehiculo);

    vehiculo.actualizarKilometraje(17000.0);

    System.out.println("Vehiculo actualizado: " + vehiculo);
  }
}
