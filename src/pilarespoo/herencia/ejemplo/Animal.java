package pilarespoo.herencia.ejemplo;

public class Animal {

  private String nombre;
  private String tipo;

  public Animal(String nombre) {
    this(nombre, "Default");
  }

  public Animal(String nombre, String tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }

  protected void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }

  public String getNombre() {
    return nombre;
  }
}
