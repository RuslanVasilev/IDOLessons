package Lesson4;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);
        while (true) {
            humanMakeTurn(field);
            printField(field);

            if (isWinner(field, "X")) {
                System.out.println("Ты победил! Комп тупой!");
                break;
            }
            if (isLoose(field)) {
                break;
            }

            compMakeTurn(field);
            printField(field);

            if (isWinner(field, "0")) {
                System.out.println("Копм победил! Ты тупой!");
                break;
            }
            if (isLoose(field)) {
                break;
            }

        }

    }

    // Игровое поле
    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    // Печать игрового поля
    public static void printField(String[][] field) {
        System.out.println("===========");
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Ход человека -> мы не должны выйти за игровое поле, мы не можем сходить туда куда уже сходили
    public static void humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Тут занято! Переходите!");
                }
            } else {
                System.out.println("За пределами поля! Переходите!");
            }
        }
    }


    // Ход компа
    public static void compMakeTurn(String[][] field) {
        Random rn = new Random();
        while (true) {
            int x = rn.nextInt(field.length);
            int y = rn.nextInt(field.length);
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }

            }

        }
    }


    // Проверка победы
    public static boolean isWinner(String[][] field, String turn) {
        if (
                (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn)) ||
                        (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn)) ||
                        (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn))

        ) {
            return true;
        } else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) ||
                        (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        } else if (
                (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn))

        ) {
            return true;
        } else {
            return false;
        }
    }

    // Ничья
    public static boolean isLoose(String[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }

            }
        }
        System.out.println("Вы оба тупые!");
        return true;

    }
}





