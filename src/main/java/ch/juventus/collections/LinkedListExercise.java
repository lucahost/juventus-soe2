package ch.juventus.collections;

import java.util.LinkedList;


public class LinkedListExercise {

    public static void main(String[] args) {
        LinkedList<String> trallala = new LinkedList<>();
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
        System.out.println(trallala.getLast());
        System.out.println(trallala.remove("Stier"));
        System.out.println(trallala.size());
        trallala.forEach(e -> System.out.println(e));

    }

}
