package conceptos.collections;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> mapa = new TreeMap<>();
        mapa.put(3, "Tres");
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");

        System.out.println("Mapa ordenado por claves: " + mapa);
        System.out.println("Valor asociado a la clave 2: " + mapa.get(2));

        mapa.remove(1);
        System.out.println("Después de eliminar la clave 1: " + mapa);
    }
}
