
package org.example.ch_10_recursion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    static void countdown(int n) {
        System.out.println(n);

//        base case
        if (n == 0) {
            System.out.println("Blast off!");
            return;
        }
//        recursive case
        countdown(n - 1);
    }

    static int factorial(int n) {
//        base case
        if (n == 1) {
            return n;
        }
//        recursive case
        return n * factorial(n - 1);
    }

    static int factorialTopDown(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialTopDown(n - 1);
    }

    static int factorialBottomUp(int start, int end) {
        if (start == end) {
            return start;
        }
        return start * factorialBottomUp(start + 1, end);
    }

    static int arraySum(int[] array, int i) {
        if (i == 0) {
            return array[i];
        }
        return array[i] + arraySum(array, i - 1);
    }

    static String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverse(str.substring(1)) + str.substring(0, 1);
    }

    static int exes(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.substring(0, 1).equals("x")) {
            return 1 + exes(str.substring(1));
        } else {
            return exes(str.substring(1));
        }
    }

    static int staircase(int n) {

        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    static int countLetters(String[] array, int n) {
        if (n == 0) {
            return array[n].length();
        }
        return array[n].length() + countLetters(array, n - 1);
    }

    static int triangularNumber(int n, int i) {

        if (i == n) {
            return i;
        }

        return i + triangularNumber(n, i + 1);
    }

}
