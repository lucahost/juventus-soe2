package ch.juventus.collections;

import java.util.*;


public class LinkedListExercise {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Geier");
        list.add("Geier");
        list.add("Affe");
        list.add("Wolf");
        list.add("Stier");
        list.add("Tiger");
        list.add("Kuh");
        list.add("Geiss");
        System.out.println(list.size());
        System.out.println(list.contains("Maus"));
        System.out.println(list.remove("Stier"));
        System.out.println(list.size());

        list = Arrays.asList();
        list.forEach(e -> System.out.println(e));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s: list) {
            System.out.println(s);
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
