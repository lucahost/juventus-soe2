package ch.juventus.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Joe", "Bob", "Rob"));

        int n = list.size();
        for (int i=0; i<n; i++) {
            System.out.println(list.get(i));
            list.remove(i);
        }

        for (String s: list) {
            System.out.println(s);
            list.remove(s);
        }

    }
}
