package conceptos;


import java.util.Scanner;

public class EjemploConsola {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola " + nombre + ", bienvenido al curso de Java!");
  }
}
