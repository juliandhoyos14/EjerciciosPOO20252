package pilarespoo.encapsulamiento.ejemplo2;

public class Persona {

  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    setEdad(edad);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad < 0 || edad > 90) {
      System.out.println("Edad no válida. Debe estar entre 0 y 90 años.");
      return;
    }
    this.edad = edad;
  }
}
