package Сollections;

import java.util.HashMap;

public class CatsAndDogs_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> cats = new HashMap<>();
        cats.put("Vatson", 1);
        cats.put("Tom", 3);
        cats.put("Felix", 6);
        HashMap<String, Integer> dogs = new HashMap<>();
        dogs.put("Muhtar", 8);
        dogs.put("Puma", 4);
        dogs.put("Bagira", 2);
        cats.putAll(dogs);
        System.out.println(cats);
    }
}
