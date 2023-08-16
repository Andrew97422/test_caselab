package org.example;

public class Main {
    public static void main(String[] args) {
    }

    /*  Task 2  */
    public static void inverseInts(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    /*  Task 3  */
    public static boolean isPalindrom(String str) {
        char[] sequenceSymbols = str.toCharArray();
        int i1 = 0;
        int i2 = sequenceSymbols.length - 1;
        while (i1 < i2) {
            if (sequenceSymbols[i1] != sequenceSymbols[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}