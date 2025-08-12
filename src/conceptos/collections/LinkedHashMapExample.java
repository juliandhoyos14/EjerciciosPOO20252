package conceptos.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Rojo");
        linkedHashMap.put(2, "Verde");
        linkedHashMap.put(3, "Azul");
        linkedHashMap.put(5, "Rojo");
        linkedHashMap.put(4, "Amarillo");

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Valor asociado a la clave 2: " + linkedHashMap.get(2));

        linkedHashMap.remove(1);
        System.out.println("Después de eliminar la clave 1: " + linkedHashMap);
    }
}
