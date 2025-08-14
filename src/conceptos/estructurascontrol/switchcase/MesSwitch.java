package conceptos.estructurascontrol.switchcase;

import java.util.Scanner;

public class MesSwitch {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un número de mes: ");
    int mes = 0;
    if (scanner.hasNextInt()) {
      mes = scanner.nextInt();
      String nombreMes = switch (mes) {
        case 1 -> "Enero";
        case 2 -> "Febrero";
        case 3 -> "Marzo";
        case 4 -> "Abril";
        case 5 -> "Mayo";
        case 6 -> "Junio";
        case 7 -> "Julio";
        case 8 -> "Agosto";
        case 9 -> "Septiembre";
        case 10 -> "Octubre";
        case 11 -> "Noviembre";
        case 12 -> "Diciembre";
        default -> "Mes no válido";
      };
      System.out.println(nombreMes);

      switch (mes) {
        case 1:
          nombreMes = "Enero";
          break;
        case 2:
            nombreMes = "Febrero";
            break;
        case 3:
            nombreMes = "Marzo";
            break;
        case 4:
            nombreMes = "Abril";
            break;
        case 5:
            nombreMes = "Mayo";
            break;
        case 6:
            nombreMes = "Junio";
            break;
        case 7:
            nombreMes = "Julio";
            break;
        case 8:
            nombreMes = "Agosto";
            break;
        case 9:
            nombreMes = "Septiembre";
            break;
        case 10:
            nombreMes = "Octubre";
            break;
        case 11:
            nombreMes = "Noviembre";
            break;
        case 12:
            nombreMes = "Diciembre";
            break;
        default:
            nombreMes = "Mes no válido";
      }
      System.out.println(nombreMes);

    } else {
      System.out.println("El valor introducido no es un número.");
    }
  }
}
