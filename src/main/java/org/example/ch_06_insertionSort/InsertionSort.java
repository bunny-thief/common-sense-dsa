package org.example.ch_06_insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 7, 1, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            // store the value of the index 1 in temp
            int temp = array[i];

            int position = i - 1;

            while (position >= 0) {
                // check if the value to the left of is greater than temp
                if (array[position] > temp) {
                    // move value in postion one index to the right
                    array[position + 1] = array[position];
                    position--;
                } else {
                    // break if the value to the left of temp is not larger
                    break;
                }
            }
            // save temp in index position + 1
            array[position + 1] = temp;
        }
    }

}
