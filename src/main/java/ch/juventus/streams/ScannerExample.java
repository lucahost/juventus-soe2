package ch.juventus.streams;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float:");
        float f = sc.nextFloat();
        System.out.printf("You entered %f.\n", f);
    }
}
