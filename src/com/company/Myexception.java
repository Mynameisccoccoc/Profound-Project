package com.company;


public class Myexception {
    static void check(int n) {
        if (n < 0)

            throw new ArithmeticException("Number is negative");
        else
            System.out.println("Number is positive");
    }

    public static void main(String[] args) {
        try {
            check(3);
            check(-9);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
