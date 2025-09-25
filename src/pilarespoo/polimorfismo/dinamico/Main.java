package pilarespoo.polimorfismo.dinamico;

public class Main {

    public static void main(String[] args) {
      Animal perro = new Perro();
      Animal gato = new Gato();

      perro.hacerSonido();  // Llama al metodo en la clase Perro
      gato.hacerSonido();  // Llama al metodo en la clase Gato

      /*
      Conclusión: Aunque estamos usando la misma referencia (Animal),
      cada objeto ejecuta su propia versión del metodo hacerSonido()
       */
    }
}
