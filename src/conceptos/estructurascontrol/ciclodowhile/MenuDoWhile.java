package conceptos.estructurascontrol.ciclodowhile;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuDoWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("---- MENÚ ----");
      System.out.println("1. Opción 1");
      System.out.println("2. Opción 2");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1 -> ejecutarOpcion1();
        case 2 -> System.out.println(LocalDateTime.now());
        case 3 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 3);
  }

  private static void ejecutarOpcion1() {
    System.out.println("Has seleccionado la Opción 1.");
    System.out.println("Aquí puedes realizar alguna acción específica.");
  }
}
