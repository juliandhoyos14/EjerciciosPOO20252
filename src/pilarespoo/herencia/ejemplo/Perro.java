package pilarespoo.herencia.ejemplo;

public class Perro extends Animal {

  private String raza;

  public Perro(String nombre, String raza) {
    super(nombre);
    this.raza = raza;
  }

  @Override
  protected void hacerSonido() {
    super.hacerSonido();
    System.out.println("El perro ladra");
  }

  public String getRaza() {
    return raza;
  }
}
