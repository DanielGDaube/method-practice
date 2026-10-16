package com.pluralsight;

public class CompareNumbers {
    public static boolean isEven(int num){
        boolean even = num%2 == 0;
        return even;
    }
    public static boolean isPositive(double num){
        boolean positive = num > 0;
        return positive;
    }
    public static void main(String[] args) {
        System.out.println(isEven(1));
        System.out.println(isEven(2));
        System.out.println(isPositive(-2.3));
        System.out.println(isPositive(2.3));

    }
}
