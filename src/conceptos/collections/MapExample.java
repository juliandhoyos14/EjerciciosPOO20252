package conceptos.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {
    Map<String, Integer> productos = new HashMap<>(Map.of(
        "Balon", 10000,
        "Camiseta", 20000,
        "Botas", 30000,
        "Gorra", 15000,
        "Pantalones", 25000
    ));

    // Imprimir todos los productos y sus precios
    System.out.println("Productos y precios:");
    for (String clave : productos.keySet()) {
      System.out.println("Clave: " + clave + ", Valor: " + productos.get(clave));
    }

    productos.replace("Balon", 20000);
    System.out.println("Productos y precios:");
    for (String clave : productos.keySet()) {
      System.out.println("Clave: " + clave + ", Valor: " + productos.get(clave));
    }
  }
}
