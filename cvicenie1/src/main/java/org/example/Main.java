package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println( compareNumbers(1, 2) );
        System.out.println( compareNumbers(2, 1) );
        System.out.println( compareNumbers(1, 1) );
    }

    public static int compareNumbers(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        }
        else {
            return 1;
        }
    }
}