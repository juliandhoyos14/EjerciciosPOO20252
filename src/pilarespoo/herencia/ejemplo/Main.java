package pilarespoo.herencia.ejemplo;

public class Main {

  public static void main(String[] args) {
    Animal perro = new Perro("Firulais", "Labrador");
    System.out.println("El nombre del perro es: " + perro.getNombre());
    System.out.println("El perro es de raza: " + ((Perro) perro).getRaza());
    perro.hacerSonido();
  }
}
