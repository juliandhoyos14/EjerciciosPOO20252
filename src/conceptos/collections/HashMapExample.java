package conceptos.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {

  public static void main(String[] args) {
    Map<Integer, String> tabla = new HashMap<>();
    tabla.put(1, "Rojo");
    tabla.put(2, "Verde");
    tabla.put(5, "Rojo");
    tabla.put(3, "Azul");
    tabla.put(4, "Amarillo");

    System.out.println("Hashmap: " + tabla);
    System.out.println("Valor asociado a la clave 2: " + tabla.get(2));

    tabla.remove(1);
    System.out.println("Después de eliminar la clave 1: " + tabla);

    System.out.println("Recorriendo las claves y valores de la tabla con for-each:");
    for (Integer clave : tabla.keySet()) {
      System.out.println("Clave: " + clave + ", Valor: " + tabla.get(clave));
    }

    System.out.println("Recorriendo las entradas de la tabla con for-each:");
    for (Map.Entry<Integer, String> entry : tabla.entrySet()) {
      System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
    }
  }
}
