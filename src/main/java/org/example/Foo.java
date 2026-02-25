package org.example;

public class Foo {

    // 1. NullPointerException risk: accessing a method on a possibly null object
    public static int stringLength(String s) {
        return s.length(); // Issue: s could be null
    }

    // 2. Integer division bug: result may be truncated
    public static double average(int a, int b) {
        return (a + b) / 2; // Issue: integer division, should cast to double
    }

    // 3. Infinite recursion: method calls itself with no base case
    public static int infiniteRecursion(int n) {
        return infiniteRecursion(n - 1); // Issue: no termination condition
    }
}
