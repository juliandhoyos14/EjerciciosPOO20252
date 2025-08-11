package conceptos.arrays;


import ejemplo.ejercicio1.Persona;

public class ArrayObjetos {

  public static void main(String[] args) {

    Persona[] personas = {
        new Persona("Carlos", 28),
        new Persona("Ana", 24),
        new Persona("Luis", 35)
    };

    System.out.println(personas[0]);

    System.out.println("Información de Personas:");
    for (Persona p : personas) {
      p.mostrarInformacion();
    }
  }
}
