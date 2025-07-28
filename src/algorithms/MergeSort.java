package algorithms;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] num1 = {19, 1, 5, 7, 70, 26, 15};
        int [] num2 = {5, 4, 3, 2, 1};
        int [] num3 = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        System.out.println(Arrays.toString(num1));
        mergeSort(num1);
        System.out.println(Arrays.toString(num1));

        System.out.println(Arrays.toString(num2));
        mergeSort(num2);
        System.out.println(Arrays.toString(num2));

        System.out.println(Arrays.toString(num3));
        mergeSort(num3);
        System.out.println(Arrays.toString(num3));

    }

    public static void mergeSort(int[] num) {

        if (num.length <= 1) {
            return;
        }

        int mid = num.length / 2;
        int[] left = new int[mid];
        int[] right = new int[num.length - mid];

        System.arraycopy(num, 0, left, 0, mid);
        System.arraycopy(num, mid, right, 0, num.length - mid);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, num);
    }

    public static void merge(int[] left, int[] right, int[] num) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                num[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                num[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < left.length) {
            num[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < right.length) {
            num[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }
    }
}

