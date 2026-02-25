package org.example;

public class Bar {

    // 1. NullPointerException risk
    public static int getStringLength(String s) {
        return s.length(); // s could be null
    }

    // 2. Integer division bug
    public static double computeAverage(int a, int b) {
        return (a + b) / 2; // integer division, should cast to double
    }

    // 3. Infinite recursion
    public static int recursiveSum(int n) {
        return recursiveSum(n - 1); // no base case, causes StackOverflowError
    }
}
