package org.example.ch_04_bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                isSorted = swapNumbers(array, isSorted, i);
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static boolean swapNumbers(int[] array, boolean isSorted, int i) {
        if (array[i] > array[i + 1]) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            isSorted = true;
        }
        return isSorted;
    }

}
