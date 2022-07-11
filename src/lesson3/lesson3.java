package lesson3;

import com.sun.istack.internal.NotNull;

public class lesson3 {

    public static void main(String[] args) {


        twoArg(3, 3);
        System.out.println();
        // 1 задание
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        // 2 задание
        int[] sto = new int[100];
        for (int i = 0; i < 100; i++) {
            sto[i] = i + 1;
        }
        for (int i = 0; i < sto.length; i++) {
            System.out.print(sto[i] + " ");
        }
        System.out.println();
        // 3 задание
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        // 4 задание
        int[][] boxArray = new int[4][4];
        for (int i = 0; i < boxArray.length; i++) {
            boxArray[i][i] = 1;
        }
        for (int i = 0; i < boxArray.length; i++) {
            boxArray[i][boxArray.length - 1 - i] = 1;
        }
        for (int i = 0; i < boxArray.length; i++) {
            for (int j = 0; j < boxArray.length; j++) {
                System.out.print(boxArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 6 задание
        int[] Array = new int[6];
        Array[0] = 0;
        Array[1] = 3;
        Array[2] = 34;
        Array[3] = 6;
        Array[4] = 342;
        Array[5] = 32;
        int max = getMax(Array);
        System.out.println("Максимальное значение: " + max);
        int min = getMin(Array);
        System.out.println("Минимальное значение: " + min);


    }

    // 5 задание
    public static int[] twoArg(int len, int initialValue) {
        int[] arg = new int[len];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = initialValue;
        }
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i]);
        }
        return arg;

    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }


}








