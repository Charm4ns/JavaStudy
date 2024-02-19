package com.lhw.demoUOG;

public class TestRecursive {
    public static void printBackwards(String s) {
        if (s.length() > 0) {
            printBackwards(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    public static void main(String[] args) {
        printBackwards("Hello"); // Change the argument as needed
    }
}
