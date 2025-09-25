package pilarespoo.polimorfismo.interfaces;

public class Main {

  public static void main(String[] args) {
    // Arreglo de dispositivos de comunicación
    /*Comunicador[] dispositivos = {
        new TelefonoFijo(),
        new TelefonoMovil(),
        new Computadora()
    };*/
    Comunicador telefonoFijo = new TelefonoFijo();
    Comunicador telefonoMovil = new TelefonoMovil();
    Comunicador computadora = new Computadora();

    // Simulamos hacer una llamada desde distintos dispositivos
    /*for (Comunicador dispositivo : dispositivos) {
      dispositivo.llamar("+123456789");
    }*/

    telefonoFijo.llamar("+123456789");
    telefonoMovil.llamar("+987654321");
    computadora.llamar("+192837465");
  }
}
