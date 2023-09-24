package org.example.ch_05_selectionSort;

import java.util.Arrays;

public class ch_05_selectionSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            // store smallest index, smallest value
            int smallestIndex = i;
            int smallest = array[smallestIndex];

            for (int j = i + 1; j < array.length; j++) {
                // update smallest, smallestIndex if a smaller number is found
                if (array[j] < smallest) {
                    smallestIndex = j;
                    smallest = array[smallestIndex];
                }
            }

            // if swap i with smallest index if
            // they are not the same
            if (smallestIndex != i) {
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }
        }
    }

}
