package org.example;

public class homework_001 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-3, 14);
        compareNumbers(10, -9);
        printColor(123);
        drawSquare();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("сумма положительна");
        } else System.out.println("сумма отрицательна");
    }

    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("желтый");
        } else System.out.println("зеленый");
    }

    public static void drawSquare() {
        System.out.println("  0");
        System.out.println("--|--");
        System.out.println(" /|");

    }
}