package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
      inputTwoNumbers();
    }

    public static void inputTwoNumbers() {
        int a = 9;
        int b = 5;
        int c = a + b;
        if (c >= 10 && c <= 20) {

            System.out.println("True");


        }  else if (c < 10 && c >20){
            System.out.println("False");
        }

    }
}
