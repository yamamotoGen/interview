package algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] num1 = {19, 1, 5, 7, 70, 26, 15};
        int [] num2 = {5, 4, 3, 2, 1};
        int [] num3 = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        System.out.println(Arrays.toString(num1));
        insertionSort(num1);
        System.out.println(Arrays.toString(num1));

        System.out.println(Arrays.toString(num2));
        insertionSort(num2);
        System.out.println(Arrays.toString(num2));

        System.out.println(Arrays.toString(num3));
        insertionSort(num3);
        System.out.println(Arrays.toString(num3));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
