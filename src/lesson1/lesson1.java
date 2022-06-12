package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Апельсин");
        System.out.println("Банан");
        System.out.println("Яблоко");

    }

    public static void checkSumSing() {
        int a = 8;
        int b = 16;
        int result = a + b;

        if (result >= 0) {
            System.out.println("Сумма положителььная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 7;
        int b = 43;
        if (a >= b) {
            System.out.println("a больше или равно b");
        }
        else {
            System.out.println("a меньше b");
        }
    }
}
