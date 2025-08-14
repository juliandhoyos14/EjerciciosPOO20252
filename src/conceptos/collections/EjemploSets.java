package conceptos.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSets {

  public static void main(String[] args) {

    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(3);
    hashSet.add(10);
    hashSet.add(50);
    hashSet.add(2);
    hashSet.add(80);
    hashSet.add(4);
    hashSet.add(3);
    hashSet.add(6);
    hashSet.add(7);
    hashSet.add(9);

    System.out.println("Conjunto de números: " + hashSet);

    Set<Integer> treeSet = new TreeSet<>(hashSet);
    System.out.println("Conjunto ordenado: " + treeSet);

  }
}
