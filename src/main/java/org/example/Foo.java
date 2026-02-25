package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    // 4. ArrayIndexOutOfBoundsException risk: index not checked
    public static int getElement(int[] arr, int index) {
        return arr[index]; // Issue: index may be out of bounds
    }

    // 5. Resource leak: FileReader not closed
    public static String readFirstLine(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);
        return br.readLine(); // Issue: reader and br not closed
    }
}
