package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static String formatName(){
        Scanner nameScanner = new Scanner(System.in);
        String name = (nameScanner.nextLine() + ", " + nameScanner.nextLine());
        return name;

    }
    public static void main(String[] args) {
        String name = formatName();
        System.out.println(name);

    }
}
