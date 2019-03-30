package ch.juventus.streams;

import java.util.Scanner;

public class ScannerExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> ");
        double d = scanner.nextDouble();
        System.out.printf("Input was %.2f", d);
    }
}
