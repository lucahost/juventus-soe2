package ch.juventus.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class ArrayListExercise {

    public static void main(String[] args) {
        List<String> trallala = new ArrayList<>();
        trallala.add("Geier");
        trallala.add("Geier");
        trallala.add("Affe");
        trallala.add("Wolf");
        trallala.add("Stier");
        trallala.add("Tiger");
        trallala.add("Kuh");
        trallala.add("Geiss");
        System.out.println(trallala.size());
        System.out.println(trallala.contains("Maus"));
        System.out.println(trallala.get(2));
        System.out.println(trallala.remove("Stier"));
        System.out.println(trallala.size());
        trallala.forEach(e -> System.out.println(e));

    }

}
