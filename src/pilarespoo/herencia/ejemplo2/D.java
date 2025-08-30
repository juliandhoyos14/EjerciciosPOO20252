package pilarespoo.herencia.ejemplo2;

public class D extends B implements E, F, G {

  void mostrarD() {
      mostrar();
  }

  @Override
  public void metodo1() {
    System.out.println("metodo1 D");
  }
}
