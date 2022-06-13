package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        inputTwoNumbers();
        System.out.println(ot10Do20(7, 9));
        Number(0);
        System.out.println(ifNumber(0));
        wordCycle("Сообщение повторяется", 3);
        System.out.println(leapYear(1200));
    }

    public static void inputTwoNumbers() {
        int a = 9;
        int b = 5;
        int c = a + b;
        if (c >= 10 && c <= 20) {

            System.out.println("True");


        } else if (c < 10 && c > 20) {
            System.out.println("False");
        }
    }

    public static boolean ot10Do20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void Number(int n) {
        if (n < 0) {
            System.out.println("Число отритцательное");
        } else if (n == 0) {
            System.out.println("Число ноль");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean ifNumber(int j) {
        return j < 0;
    }

    public static void wordCycle(String words, int cycle) {
        for (int i = 0; i < cycle; i++)
            System.out.println(words);
    }

    public static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0));
    }
}
