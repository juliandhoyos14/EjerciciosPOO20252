package pilarespoo.herencia.ejemplovehiculos;

public class Main {

  public static void main(String[] args) {
    Vehiculo miCarro = new Carro("Mazda", 2020, 240.0, "Sedan", 4);
    /*System.out.println("Marca: " + miCarro.getMarca());
    System.out.println("Modelo: " + miCarro.getModelo());
    System.out.println("Velocidad Maxima: " + miCarro.getVelocidadMaxima());
    System.out.println("Linea del carro: " + ((Carro) miCarro).getLinea());
    System.out.println("Numero de puertas: " + ((Carro) miCarro).getNumeroPuertas());*/
    System.out.println(miCarro);
    ((Carro) miCarro).encenderLimpiaparabrisas();

    Vehiculo miMoto = new Motocicleta("Yamaha", 2021, 180.0, 4);
    System.out.println("Marca: " + miMoto.getMarca());
    System.out.println("Modelo: " + miMoto.getModelo());
    System.out.println("Velocidad Maxima: " + miMoto.getVelocidadMaxima());
    System.out.println("Tiempos: " + ((Motocicleta) miMoto).getTiempos());
    ((Motocicleta) miMoto).picar();

    Volador miAvion = new Avion("Boeing", 2019, 900.0, 2);
    System.out.println("Marca: " + ((Avion) miAvion).getMarca());
    System.out.println("Modelo: " + ((Avion) miAvion).getModelo());
    System.out.println("Velocidad Maxima: " + ((Avion) miAvion).getVelocidadMaxima());
    System.out.println("Numero de motores: " + ((Avion) miAvion).getNumeroMotores());
    miAvion.volar();
  }
}
